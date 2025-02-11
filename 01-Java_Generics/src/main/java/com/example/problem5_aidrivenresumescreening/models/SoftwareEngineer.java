package com.example.problem5_aidrivenresumescreening.models;

// Creating SoftwareEngineer class extending JobRole
public class SoftwareEngineer extends JobRole {
    public SoftwareEngineer(String candidateName) {
        super(candidateName);
    }

    @Override
    public String getRoleType() {
        return "Software Engineer";
    }
}
