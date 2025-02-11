package com.example.problem5_aidrivenresumescreening.models;

// Creating JobRole abstract class to represent different job roles
public abstract class JobRole {
    protected String candidateName;

    public JobRole(String candidateName) {
        this.candidateName = candidateName;
    }

    // Defining abstract method to get job role type
    public abstract String getRoleType();

    public String getCandidateName() {
        return candidateName;
    }
}

