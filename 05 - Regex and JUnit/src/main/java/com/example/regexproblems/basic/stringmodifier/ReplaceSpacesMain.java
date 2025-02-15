package com.example.regexproblems.basic.stringmodifier;

import com.example.regexproblems.basic.stringmodifier.StringModifier;

import java.util.Scanner;

// Creating main class to demonstrate space replacement
public class ReplaceSpacesMain {
    public static void main(String[] args) {
        // Taking user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence with multiple spaces:");
        String input = scanner.nextLine();

        // Replacing multiple spaces with a single space
        String result = StringModifier.replaceMultipleSpaces(input);

        // Printing modified string
        System.out.println("Modified String: " + result);

        // Closing scanner
        scanner.close();
    }
}

