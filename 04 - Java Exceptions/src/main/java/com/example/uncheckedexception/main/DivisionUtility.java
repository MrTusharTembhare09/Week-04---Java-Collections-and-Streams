package com.example.uncheckedexception.main;

public class DivisionUtility {

    // Performing division of two numbers
    public static double divideNumbers(double numerator, double denominator) {
        // Checking if denominator is zero
        if (denominator == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return numerator / denominator; // Returning the division result
    }
}

