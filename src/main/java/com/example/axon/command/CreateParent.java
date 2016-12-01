package com.example.axon.command;

public class CreateParent {

    private String parentId;
    private String parentName;

    public CreateParent(String parentId, String parentName) {
        this.parentId = parentId;
        this.parentName = parentName;
    }

    public String getParentId() {
        return parentId;
    }

    public String getParentName() {
        return parentName;
    }
}
