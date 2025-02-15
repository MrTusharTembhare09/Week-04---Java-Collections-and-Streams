package com.example.junitproblems.advanced.security;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Creating JUnit test class for PasswordValidator
public class PasswordValidatorTest {
    @Test
    void testValidPassword() {
        assertTrue(PasswordValidator.isValid("StrongP4ss"));
    }

    @Test
    void testShortPassword() {
        assertFalse(PasswordValidator.isValid("Sh0rt"));
    }

    @Test
    void testNoUpperCase() {
        assertFalse(PasswordValidator.isValid("weakpass1"));
    }

    @Test
    void testNoDigit() {
        assertFalse(PasswordValidator.isValid("NoDigitPass"));
    }

    @Test
    void testNullPassword() {
        assertFalse(PasswordValidator.isValid(null));
    }
}
