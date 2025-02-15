package com.example.regexproblems.advanced.creditcardvalidator.utils;

import java.util.regex.Pattern;

public class CreditCardValidator {
    // Defining regex patterns for Visa and MasterCard validation
    private static final String VISA_PATTERN = "^4[0-9]{15}$";
    private static final String MASTERCARD_PATTERN = "^5[1-5][0-9]{14}$";

    private static final Pattern visaPattern = Pattern.compile(VISA_PATTERN);
    private static final Pattern masterCardPattern = Pattern.compile(MASTERCARD_PATTERN);

    // Validating if the given number is a valid Visa or MasterCard
    public static String validateCard(String cardNumber) {
        if (cardNumber == null) {
            return "Invalid";
        }

        if (visaPattern.matcher(cardNumber).matches()) {
            return "Visa";
        } else if (masterCardPattern.matcher(cardNumber).matches()) {
            return "MasterCard";
        } else {
            return "Invalid";
        }
    }
}

