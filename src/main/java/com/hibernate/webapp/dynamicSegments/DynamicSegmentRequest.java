package com.hibernate.webapp.dynamicSegments;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = DynamicSegment.class, name = "SEGMENT"),
        @JsonSubTypes.Type(value = DynamicSegmentElement.class, name = "ITEM")
})
public abstract class DynamicSegmentRequest {

    protected String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
