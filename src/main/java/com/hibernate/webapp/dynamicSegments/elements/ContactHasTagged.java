package com.hibernate.webapp.dynamicSegments.elements;

public class ContactHasTagged extends Settings {

    private String value;

    public ContactHasTagged() {
        name = "TAGGED";
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
