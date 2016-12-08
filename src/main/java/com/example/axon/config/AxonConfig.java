package com.example.axon.config;

import org.axonframework.config.EventHandlingConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AxonConfig {

//    @Autowired
//    private EventStorageEngine eventStorageEngine;
//
//    @Bean
//    public EventStore eventBus() throws Exception {
//        return new EmbeddedEventStore(eventStorageEngine);
//    }
//
//    @Bean
//    public Repository<Parent> parentRepository() throws Exception {
//        return new EventSourcingRepository<>(Parent.class, eventBus());
//    }

    @Autowired
    public void configure(EventHandlingConfiguration configuration) {
        configuration.registerTrackingProcessor("com.example.axon.eventhandling");
    }
}
