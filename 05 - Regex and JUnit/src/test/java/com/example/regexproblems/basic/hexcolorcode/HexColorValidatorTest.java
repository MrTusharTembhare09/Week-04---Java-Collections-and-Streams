package com.example.regexproblems.basic.hexcolorcode;

import com.example.regexproblems.basic.hexcolorcode.HexColorValidator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Creating JUnit test class for HexColorValidator
public class HexColorValidatorTest {

    @Test
    void testValidHexColors() {
        assertTrue(HexColorValidator.isValidHexColor("#FFA500"));
        assertTrue(HexColorValidator.isValidHexColor("#ff4500"));
        assertTrue(HexColorValidator.isValidHexColor("#00FF00"));
        assertTrue(HexColorValidator.isValidHexColor("#abcdef"));
        assertTrue(HexColorValidator.isValidHexColor("#123456"));
    }

    @Test
    void testInvalidHexColors() {
        assertFalse(HexColorValidator.isValidHexColor("#123"));     // Too short
        assertFalse(HexColorValidator.isValidHexColor("#GGGGGG"));  // Invalid hex characters
        assertFalse(HexColorValidator.isValidHexColor("FFA500"));   // Missing #
        assertFalse(HexColorValidator.isValidHexColor("#12345G"));  // Contains invalid character G
        assertFalse(HexColorValidator.isValidHexColor("#1234567")); // Too long
    }
}

