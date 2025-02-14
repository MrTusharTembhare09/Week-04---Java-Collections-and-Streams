package com.example.customexception.main;

import java.util.Scanner;

public class AgeValidationMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Asking the user to enter age
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            // Calling validateAge() method
            AgeValidator.validateAge(age);

            // Printing success message if no exception occurs
            System.out.println("Access granted!");
        } catch (InvalidAgeException e) {
            // Handling custom exception and displaying message
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Closing the scanner
            scanner.close();
        }
    }
}

