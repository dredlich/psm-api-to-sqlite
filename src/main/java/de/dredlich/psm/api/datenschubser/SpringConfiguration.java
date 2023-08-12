package de.dredlich.psm.api.datenschubser;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;

@Configuration
@EnableAutoConfiguration
public class SpringConfiguration {

    @Autowired
    Environment env;

    @Bean
    public DataSource dataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName(env.getProperty("driverClassName"));
        dataSourceBuilder.url(env.getProperty("url"));
        return dataSourceBuilder.build();
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
