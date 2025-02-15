package com.example.regexproblems.advanced.ssnvalidator.test;

import com.example.regexproblems.advanced.ssnvalidator.utils.SSNValidator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SSNValidatorTest {

    @Test
    void testValidSSN() {
        // Checking valid SSN format
        assertTrue(SSNValidator.isValidSSN("123-45-6789"));
    }

    @Test
    void testInvalidSSNWithoutDashes() {
        // Checking SSN without dashes
        assertFalse(SSNValidator.isValidSSN("123456789"));
    }

    @Test
    void testInvalidSSNWithExtraDigits() {
        // Checking SSN with extra numbers
        assertFalse(SSNValidator.isValidSSN("123-456-7890"));
    }

    @Test
    void testExtractValidSSN() {
        // Extracting SSN from a text
        assertEquals("123-45-6789", SSNValidator.extractSSN("My SSN is 123-45-6789."));
    }

    @Test
    void testExtractNoSSN() {
        // Extracting when no SSN is present
        assertEquals("No SSN found", SSNValidator.extractSSN("There is no SSN here."));
    }
}

