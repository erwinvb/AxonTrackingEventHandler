package com.example.axon.domain;

import com.example.axon.command.CreateParent;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.commandhandling.model.AggregateIdentifier;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.spring.stereotype.Aggregate;

import static org.axonframework.commandhandling.model.AggregateLifecycle.apply;

@Aggregate
public class Parent {

    @AggregateIdentifier
    private String parentId;
    private String parentName;

    @CommandHandler
    public Parent(CreateParent command) {
        apply(new ParentCreated(command.getParentId(), command.getParentName()));
    }

    @EventSourcingHandler
    private void onCreate(ParentCreated event) {
        parentId = event.getParentId();
        parentName = event.getParentName();
    }

    private Parent() {
    }

    public String getParentId() {
        return parentId;
    }

    public String getParentName() {
        return parentName;
    }
}
