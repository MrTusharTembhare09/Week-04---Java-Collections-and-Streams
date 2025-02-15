package com.example.regexproblems.advanced.currencyextractor.main;

import com.example.regexproblems.advanced.currencyextractor.utils.CurrencyExtractor;
import java.util.List;
import java.util.Scanner;

public class CurrencyExtractorMain {
    public static void main(String[] args) {
        // Creating scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Asking user for input
        System.out.println("Enter a text containing currency values:");
        String text = scanner.nextLine();

        // Extracting currency values from input
        List<String> currencyValues = CurrencyExtractor.extractCurrencyValues(text);

        // Displaying extracted currency values
        System.out.println("Extracted Currency Values: " + String.join(", ", currencyValues));

        // Closing scanner
        scanner.close();
    }
}

