package org.example;

import org.example.db.SampleDatasourceConfig;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@AutoConfiguration
@AutoConfigureOrder(100)
@ComponentScan({"org.example.db"})
@Import({SampleDatasourceConfig.class})
public class ExampleConfig {
}
