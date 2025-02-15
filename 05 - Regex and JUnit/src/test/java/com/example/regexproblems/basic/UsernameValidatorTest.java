package com.example.regexproblems.basic;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Creating JUnit test class for UsernameValidator
public class UsernameValidatorTest {

    @Test
    void testValidUsernames() {
        assertTrue(UsernameValidator.isValidUsername("user_123"));
        assertTrue(UsernameValidator.isValidUsername("ValidUser99"));
        assertTrue(UsernameValidator.isValidUsername("Test_User"));
    }

    @Test
    void testInvalidUsernames() {
        assertFalse(UsernameValidator.isValidUsername("123user")); // Starts with number
        assertFalse(UsernameValidator.isValidUsername("us")); // Too short
        assertFalse(UsernameValidator.isValidUsername("this_is_a_very_long_username")); // Too long
        assertFalse(UsernameValidator.isValidUsername("invalid@name")); // Special characters not allowed
    }
}

