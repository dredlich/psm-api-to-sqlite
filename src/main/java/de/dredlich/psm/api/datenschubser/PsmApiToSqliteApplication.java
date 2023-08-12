package de.dredlich.psm.api.datenschubser;

import com.fasterxml.jackson.databind.ObjectMapper;
import de.dredlich.psm.api.datenschubser.converter.BooleanToStringConverter;
import de.dredlich.psm.api.datenschubser.model.ISetItem;
import de.dredlich.psm.api.datenschubser.model.pk.ICompPK;
import de.dredlich.psm.api.datenschubser.model.pk.ISetItemPK;
import okhttp3.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.modelmapper.ModelMapper;
import org.modelmapper.config.Configuration;
import org.modelmapper.convention.MatchingStrategies;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.support.Repositories;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
public class PsmApiToSqliteApplication implements CommandLineRunner {
    private final Logger logger = LoggerFactory.getLogger(PsmApiToSqliteApplication.class);
    private static final String BASE_URL = "https://psm-api.bvl.bund.de/ords/psm/api-v1/";
    private static final OkHttpClient client = new OkHttpClient();
    private static final HttpUrl.Builder urlBuilder = HttpUrl.parse(BASE_URL).newBuilder();
    private static final JSONParser parser = new JSONParser();
    private static final ObjectMapper objectMapper = new ObjectMapper();

    private static final String QUERY_PARAMETER_LIMIT = "limit";
    private static final String QUERY_PARAMETER_OFFSET = "offset";

    private static final String RESPONSE_BODY_PROPERTY_HAS_MORE = "hasMore";
    private static final String RESPONSE_BODY_PROPERTY_ITEMS = "items";

    private JSONArray itemList = new JSONArray();
    private List<ISetItemPK> saveItemWithEmbeddedPKList = new ArrayList<>();
    private List<ISetItem> saveItemList = new ArrayList<>();

    private ModelMapper modelMapper;
    private ApplicationContext context;
    private Repositories repositories;
    @Autowired
    PsmApiToSqliteApplication(ModelMapper modelMapper, ApplicationContext context)
    {
        this.modelMapper = modelMapper;
        this.context = context;
        this.repositories = new Repositories(context);
        this.modelMapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.STRICT)
                .setFieldMatchingEnabled(true)
                .setFieldAccessLevel(Configuration.AccessLevel.PRIVATE);
        this.modelMapper.addConverter(new BooleanToStringConverter());
    }
    @Override
    public void run(String... args) throws RuntimeException {
        for (PsmApiEnum.Endpoint endpoint: PsmApiEnum.Endpoint.values())
        {
            int offset = 0;
            int limit = 10000;

            CrudRepository repo = (CrudRepository) repositories.getRepositoryFor(endpoint.outputType).get();

            urlBuilder.setQueryParameter(QUERY_PARAMETER_LIMIT, Integer.toString(limit));
            urlBuilder.setPathSegment(3, endpoint.path);

            boolean hasMore = false;
            itemList = new JSONArray();
            do {
                urlBuilder.setQueryParameter(QUERY_PARAMETER_OFFSET, Integer.toString(offset));
                String callURL = urlBuilder.build().toString();
                hasMore = transformPageRequest(endpoint, callURL, repo);
                offset += limit;
            }
            while (hasMore);
        }
    }

    private boolean transformPageRequest(PsmApiEnum.Endpoint endpoint, String callURL, CrudRepository repo) throws RuntimeException {
        boolean hasMore = false;
        Request request = new Request.Builder().url(callURL).build();
        Call call = client.newCall(request);
        try
        {
            Response response = call.execute();
            if(response.isSuccessful() && response.body() != null)
            {

                ICompPK pk = null;
                JSONObject json = (JSONObject) parser.parse(response.body().string());
                hasMore = (boolean) json.get(RESPONSE_BODY_PROPERTY_HAS_MORE);
                itemList = (JSONArray) json.get(RESPONSE_BODY_PROPERTY_ITEMS);
                saveItemWithEmbeddedPKList = new ArrayList<>();
                saveItemList = new ArrayList<>();
                for (Object jsonObject: itemList) {
                    final JSONObject jones = (JSONObject) jsonObject;
                    final String jsonInString = objectMapper.writeValueAsString(objectMapper.readValue(jones.toJSONString(), endpoint.inputType));
                    if(null != endpoint.idType)
                    {
                        pk = (ICompPK) modelMapper.map(objectMapper.readValue(jsonInString, endpoint.inputType), endpoint.idType);
                        final ISetItemPK iSetPK = (ISetItemPK) modelMapper.map(objectMapper.readValue(jones.toJSONString(), endpoint.inputType), endpoint.outputType);
                        iSetPK.setID(pk);
                        saveItemWithEmbeddedPKList.add(iSetPK);
                    }
                    else
                    {
                        final ISetItem setItem = (ISetItem) modelMapper.map(objectMapper.readValue(jsonInString, endpoint.inputType), endpoint.outputType);
                        saveItemList.add(setItem);
                    }
                }
                if(!saveItemWithEmbeddedPKList.isEmpty()){
                    repo.saveAll(saveItemWithEmbeddedPKList);
                }
                if (!saveItemList.isEmpty()){
                    repo.saveAll(saveItemList);
                }
            }
        }
        catch (IOException | ParseException e)
        {
            throw new RuntimeException(e);
        }
        return hasMore;
    }
}
