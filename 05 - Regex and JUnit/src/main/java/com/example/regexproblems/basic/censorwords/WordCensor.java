package com.example.regexproblems.basic.censorwords;

import java.util.List;
import java.util.regex.Pattern;

// Creating utility class for censoring words
public class WordCensor {
    // Censoring bad words by replacing them with ****
    public static String censorBadWords(String input, List<String> badWords) {
        if (input == null || badWords == null) {
            return input;
        }

        String censoredText = input;
        for (String badWord : badWords) {
            // Creating regex pattern for whole word match (case-insensitive)
            String regex = "\\b" + Pattern.quote(badWord) + "\\b";
            censoredText = censoredText.replaceAll("(?i)" + regex, "****");
        }
        return censoredText;
    }
}

