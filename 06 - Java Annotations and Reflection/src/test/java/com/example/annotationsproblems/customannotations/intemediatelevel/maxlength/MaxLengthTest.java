package com.example.annotationsproblems.customannotations.intemediatelevel.maxlength;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Creating a JUnit test for max length validation
public class MaxLengthTest {

    @Test
    void testValidUsername() {
        // Ensuring valid username does not throw an error
        assertDoesNotThrow(() -> new User("Tushar"));
    }

    @Test
    void testInvalidUsername() {
        // Ensuring invalid username throws IllegalArgumentException
        Exception exception = assertThrows(IllegalArgumentException.class, () -> new User("VeryLongUsername"));
        assertEquals("Username exceeds max length of 10", exception.getMessage());
    }
}

