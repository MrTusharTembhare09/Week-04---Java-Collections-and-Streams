package com.example.regexproblems.advanced.creditcardvalidator.main;

import com.example.regexproblems.advanced.creditcardvalidator.utils.CreditCardValidator;

import java.util.Scanner;

public class CreditCardValidatorMain {
    public static void main(String[] args) {
        // Creating scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Asking user for credit card number input
        System.out.print("Enter a credit card number to validate: ");
        String cardNumber = scanner.nextLine();

        // Checking if card is Visa or MasterCard
        String cardType = CreditCardValidator.validateCard(cardNumber);
        System.out.println("Card Type: " + cardType);

        // Closing scanner
        scanner.close();
    }
}

