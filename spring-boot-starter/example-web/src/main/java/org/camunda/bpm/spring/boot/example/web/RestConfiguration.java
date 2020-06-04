package org.camunda.bpm.spring.boot.example.web;

import org.camunda.bpm.engine.spring.SpringProcessEngineConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

@Configuration
public class RestConfiguration {

    @Bean
    public SpringProcessEngineConfiguration engineConfiguration(DataSource dataSource, PlatformTransactionManager transactionManager) {
        SpringProcessEngineConfiguration configuration = new SpringProcessEngineConfiguration();
        configuration.setDataSource(dataSource);
        configuration.setTransactionManager(transactionManager);
        configuration.setJobExecutorActivate(true);
        configuration.setDatabaseSchemaUpdate("true");
        return configuration;
    }
}
