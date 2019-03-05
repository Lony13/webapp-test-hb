package com.hibernate.webapp.dynamicSegments.elements;

public class ContactHasDetail extends Settings {

    private String detail;

    public ContactHasDetail() {
        name = "DETAIL";
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
