package com.stublab.Service;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.naming.Name;

@Document

public class StubDBSequence {
    @Id
    private String name;

    private String path;
    private String description;

    public StubDBSequence() {}

    public String getName() {
        return name;
    }

    public void setName(String id) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(long seq) {
        this.path= path;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(long description) {
        this.path = path;
    }
}
