package com.example.regexproblems.basic.censorwords;

import com.example.regexproblems.basic.censorwords.WordCensor;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// Creating main class to demonstrate bad word censoring
public class CensorWordsMain {
    public static void main(String[] args) {
        // Defining a list of bad words
        List<String> badWords = Arrays.asList("damn", "stupid");

        // Taking user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();

        // Censoring bad words
        String result = WordCensor.censorBadWords(input, badWords);

        // Printing censored sentence
        System.out.println("Censored Sentence: " + result);

        // Closing scanner
        scanner.close();
    }
}

