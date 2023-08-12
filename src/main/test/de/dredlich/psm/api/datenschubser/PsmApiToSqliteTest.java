package de.dredlich.psm.api.datenschubser;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@EnableAutoConfiguration
@ContextConfiguration(classes = PsmApiToSqliteApplication.class)
public class PsmApiToSqliteTest {

    @Autowired
    private CommandLineRunner clr;

    @Test
    public void thatCommandLineRunnerDoesStuff() throws Exception {
        this.clr.run();
    }

}
