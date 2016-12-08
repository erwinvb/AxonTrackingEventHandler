package com.example.axon.eventhandling;

import com.example.axon.domain.ParentCreated;
import org.axonframework.eventhandling.EventHandler;
import org.springframework.stereotype.Component;

//@ProcessingGroup("test")
@Component
public class TestEventHandler {

    @EventHandler
    public void handle(ParentCreated event) {
        System.out.println(String.format("parent created with id: %s and name: %s", event.getParentId(), event.getParentName()));
    }
}
