package com.example.regexproblems.advanced.repeatingwords.main;

import com.example.regexproblems.advanced.repeatingwords.utils.RepeatingWordsFinder;
import java.util.Scanner;
import java.util.Set;

public class RepeatingWordsMain {
    public static void main(String[] args) {
        // Creating scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Asking user for input
        System.out.println("Enter a sentence to find repeating words:");
        String text = scanner.nextLine();

        // Finding repeating words in the sentence
        Set<String> repeatingWords = RepeatingWordsFinder.findRepeatingWords(text);

        // Displaying repeating words
        System.out.println("Repeating Words: " + String.join(", ", repeatingWords));

        // Closing scanner
        scanner.close();
    }
}

