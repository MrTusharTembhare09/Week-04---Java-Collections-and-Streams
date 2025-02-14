package com.example.finallyblock.main;

import java.util.Scanner;

public class DivisionMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Taking user input for numerator and denominator
            System.out.print("Enter numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter denominator: ");
            int denominator = scanner.nextInt();

            // Calling divide() method
            int result = DivisionCalculator.divide(numerator, denominator);

            // Displaying result
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter integers only.");
        } finally {
            // Ensuring scanner resource is closed
            scanner.close();
        }
    }
}
