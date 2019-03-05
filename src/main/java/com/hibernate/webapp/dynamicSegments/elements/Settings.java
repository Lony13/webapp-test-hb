package com.hibernate.webapp.dynamicSegments.elements;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "name")
@JsonSubTypes({
        @JsonSubTypes.Type(value = ContactHasTagged.class, name = "TAGGED"),
        @JsonSubTypes.Type(value = ContactHasDetail.class, name = "DETAIL")
})
public abstract class Settings {

    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
