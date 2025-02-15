package com.example.regexproblems.basic.emailextractor;

import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;

// Creating EmailExtractor class
public class EmailExtractor {
    // Defining regex pattern for email validation
    private static final String EMAIL_PATTERN = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";

    // Creating method to extract all email addresses from text
    public static List<String> extractEmails(String text) {
        List<String> emails = new ArrayList<>();
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            emails.add(matcher.group());
        }
        return emails;
    }
}

