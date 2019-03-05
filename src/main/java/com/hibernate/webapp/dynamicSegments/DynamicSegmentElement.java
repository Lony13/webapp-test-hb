package com.hibernate.webapp.dynamicSegments;

import com.hibernate.webapp.dynamicSegments.elements.Settings;

public class DynamicSegmentElement extends DynamicSegmentRequest {

    private String name;
    private Settings settings;

    public DynamicSegmentElement() {
        type = "ITEM";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Settings getSettings() {
        return settings;
    }

    public void setSettings(Settings settings) {
        this.settings = settings;
    }
}
