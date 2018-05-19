package com.suncorp.fullstacktraining.repaymentapi.models;

public class LoanType {

    private String id;
    private String description;


    public LoanType(String id, String description) {
        this.id = id;
        this.description = description;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }





}
