package com.example.regexproblems.advanced.currencyextractor.utils;

import java.util.*;
import java.util.regex.*;

public class CurrencyExtractor {
    // Defining regex pattern to match currency values (e.g., $45.99, 10.50)
    private static final String CURRENCY_PATTERN = "\\$?\\b\\d+\\.\\d{2}\\b";

    private static final Pattern pattern = Pattern.compile(CURRENCY_PATTERN);

    // Extracting currency values from given text
    public static List<String> extractCurrencyValues(String text) {
        List<String> currencyValues = new ArrayList<>();
        if (text == null) {
            return currencyValues;
        }

        Matcher matcher = pattern.matcher(text);

        // Finding all matches
        while (matcher.find()) {
            currencyValues.add(matcher.group());
        }
        return currencyValues;
    }
}

