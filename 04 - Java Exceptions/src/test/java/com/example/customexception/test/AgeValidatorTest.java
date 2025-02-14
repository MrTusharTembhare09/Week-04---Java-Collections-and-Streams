package com.example.customexception.test;

import com.example.customexception.main.AgeValidator;
import com.example.customexception.main.InvalidAgeException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AgeValidatorTest {

    @Test
    void testValidAge() {
        // Checking if no exception is thrown for age >= 18
        assertDoesNotThrow(() -> AgeValidator.validateAge(20));
    }

    @Test
    void testInvalidAge() {
        // Checking if InvalidAgeException is thrown for age < 18
        Exception exception = assertThrows(InvalidAgeException.class, () -> {
            AgeValidator.validateAge(16);
        });
        assertEquals("Age must be 18 or above", exception.getMessage());
    }
}

