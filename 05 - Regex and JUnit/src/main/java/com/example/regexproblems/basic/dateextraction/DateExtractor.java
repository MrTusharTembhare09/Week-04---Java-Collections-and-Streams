package com.example.regexproblems.basic.dateextraction;

import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;

// Creating DateExtractor class
public class DateExtractor {
    // Defining regex pattern for dd/mm/yyyy format
    private static final String DATE_PATTERN = "\\b(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}\\b";

    // Creating method to extract dates from text
    public static List<String> extractDates(String text) {
        List<String> dates = new ArrayList<>();
        Pattern pattern = Pattern.compile(DATE_PATTERN);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            dates.add(matcher.group());
        }
        return dates;
    }
}

