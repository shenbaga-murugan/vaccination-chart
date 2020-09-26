package com.shenba.vaccination.config;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.Collection;
import java.util.Collections;

/**
 * @author Shenbaga Murugan
 */
@Configuration
@EnableMongoRepositories(basePackages = "com.shenba.vaccination.repository")
public class VaccinationDaoConfig extends AbstractMongoClientConfiguration {

    @Override
    protected String getDatabaseName() {
        return "vaccinedb";
    }

    @Override
    public Collection getMappingBasePackages() {
        return Collections.singleton("com.shenba.vaccination.domain");
    }

    @Override
    public MongoClient mongoClient() {
        ConnectionString connectionString = new ConnectionString("mongodb://localhost:27017/vaccinedb");
        MongoClientSettings mongoClientSettings = MongoClientSettings.builder()
                .applyConnectionString(connectionString)
                .build();
        return MongoClients.create(mongoClientSettings);
    }
}
