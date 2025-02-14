package com.example.finallyblock.main;

public class DivisionCalculator {

    // Performing division and handling exceptions
    public static int divide(int numerator, int denominator) {
        try {
            // Returning division result
            return numerator / denominator;
        } catch (ArithmeticException e) {
            // Handling division by zero
            System.out.println("Error: Cannot divide by zero.");
            return 0; // Returning default value
        } finally {
            // Ensuring final execution message
            System.out.println("Operation completed.");
        }
    }
}

