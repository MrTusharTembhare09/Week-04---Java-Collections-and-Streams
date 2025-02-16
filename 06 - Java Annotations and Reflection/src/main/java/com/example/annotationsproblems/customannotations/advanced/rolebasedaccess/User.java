package com.example.annotationsproblems.customannotations.advanced.rolebasedaccess;

// Creating a User class to store user role
public class User {
    private String role;

    // Constructor to set role
    public User(String role) {
        this.role = role;
    }

    // Getting user role
    public String getRole() {
        return role;
    }
}

