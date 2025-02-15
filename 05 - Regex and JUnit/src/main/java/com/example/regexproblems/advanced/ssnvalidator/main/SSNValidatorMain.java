package com.example.regexproblems.advanced.ssnvalidator.main;

import com.example.regexproblems.advanced.ssnvalidator.utils.SSNValidator;
import java.util.Scanner;

public class SSNValidatorMain {
    public static void main(String[] args) {
        // Creating scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Asking user for input
        System.out.println("Enter a sentence containing an SSN:");
        String text = scanner.nextLine();

        // Extracting SSN from input text
        String ssn = SSNValidator.extractSSN(text);

        // Checking if SSN is valid
        if (SSNValidator.isValidSSN(ssn)) {
            System.out.println("✅ \"" + ssn + "\" is a valid SSN.");
        } else {
            System.out.println("❌ No valid SSN found.");
        }

        // Closing scanner
        scanner.close();
    }
}

