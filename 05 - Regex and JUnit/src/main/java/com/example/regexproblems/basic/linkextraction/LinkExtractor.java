package com.example.regexproblems.basic.linkextraction;

import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;

// Creating LinkExtractor class
public class LinkExtractor {
    // Defining regex pattern for extracting URLs
    private static final String URL_PATTERN = "(https?://[\\w.-]+(?:\\.[a-zA-Z]{2,})+(?:/[\\w._~:/?#[\\]@!$&'()*+,;=-]*)?]))";

    // Creating method to extract URLs from text
    public static List<String> extractLinks(String text) {
        List<String> links = new ArrayList<>();
        Pattern pattern = Pattern.compile(URL_PATTERN);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            links.add(matcher.group());
        }
        return links;
    }
}

