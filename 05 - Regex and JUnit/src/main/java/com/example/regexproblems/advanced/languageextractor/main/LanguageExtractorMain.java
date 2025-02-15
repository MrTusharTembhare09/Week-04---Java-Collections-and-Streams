package com.example.regexproblems.advanced.languageextractor.main;

import com.example.regexproblems.advanced.languageextractor.utils.LanguageExtractor;
import java.util.List;
import java.util.Scanner;

public class LanguageExtractorMain {
    public static void main(String[] args) {
        // Creating scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Asking user for input
        System.out.println("Enter a text containing programming language names:");
        String text = scanner.nextLine();

        // Extracting programming languages from input
        List<String> languages = LanguageExtractor.extractLanguages(text);

        // Displaying extracted languages
        System.out.println("Extracted Programming Languages: " + String.join(", ", languages));

        // Closing scanner
        scanner.close();
    }
}

