package com.example.junitproblems.advanced.registration;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Creating JUnit test class for UserRegistration
public class UserRegistrationTest {
    @Test
    void testValidUserRegistration() {
        assertTrue(UserRegistration.registerUser("JohnDoe", "john.doe@example.com", "Password1"));
    }

    @Test
    void testInvalidUsername() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            UserRegistration.registerUser("", "john.doe@example.com", "Password1");
        });
        assertEquals("Username cannot be empty.", exception.getMessage());
    }

    @Test
    void testInvalidEmail() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            UserRegistration.registerUser("JohnDoe", "invalid-email", "Password1");
        });
        assertEquals("Invalid email format.", exception.getMessage());
    }

    @Test
    void testWeakPassword() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            UserRegistration.registerUser("JohnDoe", "john.doe@example.com", "weak");
        });
        assertEquals("Password must have at least 8 characters, one uppercase letter, and one digit.", exception.getMessage());
    }
}