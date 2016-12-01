package com.example.axon.web;

import com.example.axon.command.CreateParent;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class ParentResource {

    private CommandGateway commandGateway;

    public ParentResource(CommandGateway commandGateway) {
        this.commandGateway = commandGateway;
    }

    @GetMapping(value = "/parents")
    public String createParent(@RequestParam String name) {
        CreateParent command = new CreateParent(UUID.randomUUID().toString(), name);
        commandGateway.send(command);
        return command.getParentId();
    }
}
