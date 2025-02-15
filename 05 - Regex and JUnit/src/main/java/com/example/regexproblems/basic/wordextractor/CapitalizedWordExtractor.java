package com.example.regexproblems.basic.wordextractor;

import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;

// Creating CapitalizedWordExtractor class
public class CapitalizedWordExtractor {
    // Defining regex pattern for capitalized words
    private static final String CAPITALIZED_WORD_PATTERN = "\\b[A-Z][a-z]*\\b";

    // Creating method to extract all capitalized words from text
    public static List<String> extractCapitalizedWords(String text) {
        List<String> capitalizedWords = new ArrayList<>();
        Pattern pattern = Pattern.compile(CAPITALIZED_WORD_PATTERN);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            capitalizedWords.add(matcher.group());
        }
        return capitalizedWords;
    }
}

