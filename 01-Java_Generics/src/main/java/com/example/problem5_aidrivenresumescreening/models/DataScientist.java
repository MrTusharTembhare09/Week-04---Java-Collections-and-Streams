package com.example.problem5_aidrivenresumescreening.models;

// Creating DataScientist class extending JobRole
public class DataScientist extends JobRole{

    public DataScientist(String candidateName) {
        super(candidateName);
    }

    @Override
    public String getRoleType() {
        return "Data Scientist";
    }
}
