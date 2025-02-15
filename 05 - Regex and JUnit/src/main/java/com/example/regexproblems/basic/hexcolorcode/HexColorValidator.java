package com.example.regexproblems.basic.hexcolorcode;

import java.util.regex.Pattern;

// Creating HexColorValidator class
public class HexColorValidator {
    // Defining regex pattern for hex color validation
    private static final String HEX_COLOR_PATTERN = "^#[0-9A-Fa-f]{6}$";

    // Creating method to validate hex color code
    public static boolean isValidHexColor(String color) {
        return Pattern.matches(HEX_COLOR_PATTERN, color);
    }
}

