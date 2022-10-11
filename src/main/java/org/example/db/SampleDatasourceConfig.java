package org.example.db;

import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author lwpro
 */
@Configuration
public class SampleDatasourceConfig {
    @Bean
    DataSource sampleDataSource() {
        return DataSourceBuilder.create()
                .username("admin")
                .password("password")
                .username("xxxxxx")
                .build();
    }

}
