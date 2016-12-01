package com.example.axon.domain;

public class ParentCreated {

    private String parentId;
    private String parentName;

    public ParentCreated(String parentId, String parentName) {
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
