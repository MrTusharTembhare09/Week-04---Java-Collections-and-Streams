package com.example.annotationsproblems.customannotations.advanced.jsonserialization;

// Creating User class with annotated fields
public class User {

    @JsonField(name = "user_name")
    private String username;

    @JsonField(name = "user_age")
    private int age;

    @JsonField(name = "user_email")
    private String email;

    // Constructor to initialize fields
    public User(String username, int age, String email) {
        this.username = username;
        this.age = age;
        this.email = email;
    }
}

