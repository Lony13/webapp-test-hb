package com.hibernate.webapp.dynamicSegments;

import java.util.List;

public class DynamicSegment extends DynamicSegmentRequest {

    private String value;
    private List<List<DynamicSegmentRequest>> columns;

    public DynamicSegment() {
        type = "SEGMENT";
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public List<List<DynamicSegmentRequest>> getColumns() {
        return columns;
    }

    public void setColumns(List<List<DynamicSegmentRequest>> columns) {
        this.columns = columns;
    }
}
