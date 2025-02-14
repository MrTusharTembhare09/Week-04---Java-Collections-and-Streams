package com.example.customexception.main;

public class AgeValidator {

    // Validating the age
    public static void validateAge(int age) throws InvalidAgeException {
        // Checking if age is less than 18
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }
    }
}
