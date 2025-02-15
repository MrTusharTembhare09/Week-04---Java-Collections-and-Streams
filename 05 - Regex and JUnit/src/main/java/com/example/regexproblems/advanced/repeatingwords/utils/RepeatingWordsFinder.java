package com.example.regexproblems.advanced.repeatingwords.utils;

import java.util.*;
import java.util.regex.*;
import java.util.stream.Collectors;

public class RepeatingWordsFinder {
    // Defining regex pattern to match repeating words (e.g., "is is", "repeated repeated")
    private static final String REPEATING_WORD_PATTERN = "\\b(\\w+)\\b(?:\\s+\\1\\b)+";

    private static final Pattern pattern = Pattern.compile(REPEATING_WORD_PATTERN, Pattern.CASE_INSENSITIVE);

    // Finding repeating words from given sentence
    public static Set<String> findRepeatingWords(String text) {
        Set<String> repeatingWords = new HashSet<>();
        if (text == null) {
            return repeatingWords;
        }

        Matcher matcher = pattern.matcher(text);

        // Finding all repeating words
        while (matcher.find()) {
            repeatingWords.add(matcher.group(1));
        }
        return repeatingWords;
    }
}

