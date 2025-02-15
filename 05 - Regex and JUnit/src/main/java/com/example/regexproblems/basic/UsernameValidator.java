package com.example.regexproblems.basic;

import java.util.regex.Pattern;

// Creating UsernameValidator class
public class UsernameValidator {
    // Defining regex pattern for username validation
    private static final String USERNAME_PATTERN = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";

    // Creating method to validate username
    public static boolean isValidUsername(String username) {
        return Pattern.matches(USERNAME_PATTERN, username);
    }
}

