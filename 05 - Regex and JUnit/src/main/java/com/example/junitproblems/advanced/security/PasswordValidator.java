package com.example.junitproblems.advanced.security;

// Creating PasswordValidator class to validate password strength
public class PasswordValidator {
    // Validating password strength
    public static boolean isValid(String password) {
        if (password == null || password.length() < 8) {
            return false;
        }
        boolean hasUpperCase = false;
        boolean hasDigit = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            }
            if (Character.isDigit(ch)) {
                hasDigit = true;
            }
        }
        return hasUpperCase && hasDigit;
    }
}