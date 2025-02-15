package com.example.regexproblems.advanced.ssnvalidator.utils;

import java.util.regex.*;

public class SSNValidator {
    // Defining regex pattern to match a valid SSN (format: XXX-XX-XXXX)
    private static final String SSN_PATTERN = "\\b\\d{3}-\\d{2}-\\d{4}\\b";

    private static final Pattern pattern = Pattern.compile(SSN_PATTERN);

    // Validating if input text contains a valid SSN
    public static boolean isValidSSN(String ssn) {
        if (ssn == null) {
            return false;
        }
        Matcher matcher = pattern.matcher(ssn);
        return matcher.matches();
    }

    // Extracting SSNs from a given text
    public static String extractSSN(String text) {
        if (text == null) {
            return "No SSN found";
        }

        Matcher matcher = pattern.matcher(text);

        // Finding first valid SSN in text
        if (matcher.find()) {
            return matcher.group();
        }
        return "No SSN found";
    }
}

