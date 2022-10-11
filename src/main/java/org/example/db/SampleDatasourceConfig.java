package org.example.db;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

/**
 * @author lwpro
 */
@Configuration
@Slf4j
public class SampleDatasourceConfig {

    @PostConstruct
    public void init() {
        log.info("some set up to prepare the datasource and other beans here...");
    }
    @Bean({"com.example.RODataSource"})
    DataSource sampleDataSource() {
        return DataSourceBuilder.create()
                .username("admin")
                .password("password")
                .username("xxxxxx")
                .build();
    }

}
