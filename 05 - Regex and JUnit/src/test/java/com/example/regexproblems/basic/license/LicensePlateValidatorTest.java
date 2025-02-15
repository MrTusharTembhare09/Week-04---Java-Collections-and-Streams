package com.example.regexproblems.basic.license;

import com.example.regexproblems.basic.license.LicensePlateValidator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Creating JUnit test class for LicensePlateValidator
public class LicensePlateValidatorTest {

    @Test
    void testValidLicensePlates() {
        assertTrue(LicensePlateValidator.isValidLicensePlate("AB1234"));
        assertTrue(LicensePlateValidator.isValidLicensePlate("XY9876"));
        assertTrue(LicensePlateValidator.isValidLicensePlate("CD4567"));
    }

    @Test
    void testInvalidLicensePlates() {
        assertFalse(LicensePlateValidator.isValidLicensePlate("A12345")); // Only one letter
        assertFalse(LicensePlateValidator.isValidLicensePlate("ABC123")); // Three letters instead of two
        assertFalse(LicensePlateValidator.isValidLicensePlate("AB12A4")); // Contains a non-digit
        assertFalse(LicensePlateValidator.isValidLicensePlate("ab1234")); // Lowercase letters
        assertFalse(LicensePlateValidator.isValidLicensePlate("XY12345")); // Five digits instead of four
    }
}

