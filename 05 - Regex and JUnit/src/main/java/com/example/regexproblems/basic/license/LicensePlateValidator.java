package com.example.regexproblems.basic.license;

import java.util.regex.Pattern;

// Creating LicensePlateValidator class
public class LicensePlateValidator {
    // Defining regex pattern for license plate validation
    private static final String LICENSE_PLATE_PATTERN = "^[A-Z]{2}\\d{4}$";

    // Creating method to validate license plate number
    public static boolean isValidLicensePlate(String plate) {
        return Pattern.matches(LICENSE_PLATE_PATTERN, plate);
    }
}

