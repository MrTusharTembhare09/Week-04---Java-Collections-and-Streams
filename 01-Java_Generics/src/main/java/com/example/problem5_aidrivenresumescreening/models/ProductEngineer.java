package com.example.problem5_aidrivenresumescreening.models;

// Creating ProductManager class extending JobRole
public class ProductEngineer extends JobRole{
    public ProductEngineer(String candidateName) {
        super(candidateName);
    }

    @Override
    public String getRoleType() {
        return "Product Manager";
    }
}
