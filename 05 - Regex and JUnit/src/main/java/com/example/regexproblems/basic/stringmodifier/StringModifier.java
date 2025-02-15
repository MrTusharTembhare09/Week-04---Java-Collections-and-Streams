package com.example.regexproblems.basic.stringmodifier;

// Creating utility class for string modifications
public class StringModifier {
    // Replacing multiple spaces with a single space
    public static String replaceMultipleSpaces(String input) {
        if (input == null) {
            return null;
        }
        return input.replaceAll("\\s+", " ");
    }
}

