package com.example.axon.config;

import com.example.axon.domain.Parent;
import org.axonframework.commandhandling.model.Repository;
import org.axonframework.eventsourcing.EventSourcingRepository;
import org.axonframework.eventsourcing.eventstore.EmbeddedEventStore;
import org.axonframework.eventsourcing.eventstore.EventStorageEngine;
import org.axonframework.eventsourcing.eventstore.EventStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AxonConfig {

    @Autowired
    private EventStorageEngine eventStorageEngine;

    @Bean
    public EventStore eventBus() throws Exception {
        return new EmbeddedEventStore(eventStorageEngine);
    }

    @Bean
    public Repository<Parent> generalLedgerRepository() throws Exception {
        return new EventSourcingRepository<>(Parent.class, eventBus());
    }
}
