package com.example.junitproblems.advanced.registration;

import java.util.regex.Pattern;

// Creating UserRegistration class for user registration validation
public class UserRegistration {
    // Registering a user with validation checks
    public static boolean registerUser(String username, String email, String password) {
        if (username == null || username.isBlank()) {
            throw new IllegalArgumentException("Username cannot be empty.");
        }
        if (email == null || !Pattern.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$", email)) {
            throw new IllegalArgumentException("Invalid email format.");
        }
        if (password == null || password.length() < 8 || !password.matches(".*[A-Z].*") || !password.matches(".*\\d.*")) {
            throw new IllegalArgumentException("Password must have at least 8 characters, one uppercase letter, and one digit.");
        }
        return true;
    }
}
