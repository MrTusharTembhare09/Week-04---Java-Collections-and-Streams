package com.example.mapinterface.groupbyproperty.model;

// Creating Employee class to store employee details
public class Employee {
    private String name;
    private String department;

    // Constructor
    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return name;
    }
}

