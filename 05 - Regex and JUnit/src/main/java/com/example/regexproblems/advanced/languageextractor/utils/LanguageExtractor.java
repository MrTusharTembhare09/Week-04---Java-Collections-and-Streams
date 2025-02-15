package com.example.regexproblems.advanced.languageextractor.utils;

import java.util.*;
import java.util.regex.*;

public class LanguageExtractor {
    // Defining regex pattern to match programming languages
    private static final String LANGUAGE_PATTERN =
            "\\b(JavaScript|Java|Python|C\\+\\+|C|Go|Ruby|Swift|Kotlin|PHP|TypeScript)\\b";

    private static final Pattern pattern = Pattern.compile(LANGUAGE_PATTERN);

    // Extracting programming languages from given text
    public static List<String> extractLanguages(String text) {
        List<String> languages = new ArrayList<>();
        if (text == null) {
            return languages;
        }

        Matcher matcher = pattern.matcher(text);

        // Finding all matches
        while (matcher.find()) {
            languages.add(matcher.group());
        }
        return languages;
    }
}

