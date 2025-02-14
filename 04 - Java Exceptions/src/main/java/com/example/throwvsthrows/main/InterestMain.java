package com.example.throwvsthrows.main;

import java.util.Scanner;

public class InterestMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Taking user input for amount, rate, and years
            System.out.print("Enter amount: ");
            double amount = scanner.nextDouble();

            System.out.print("Enter rate of interest: ");
            double rate = scanner.nextDouble();

            System.out.print("Enter number of years: ");
            int years = scanner.nextInt();

            // Calling calculateInterest() method
            double interest = InterestCalculator.calculateInterest(amount, rate, years);

            // Displaying calculated interest
            System.out.println("Calculated Interest: " + interest);
        } catch (IllegalArgumentException e) {
            // Handling thrown exception
            System.out.println("Invalid input: " + e.getMessage());
        } finally {
            // Closing scanner resource
            scanner.close();
        }
    }
}

