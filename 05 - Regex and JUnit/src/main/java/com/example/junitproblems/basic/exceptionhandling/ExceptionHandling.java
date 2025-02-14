package com.example.junitproblems.basic.exceptionhandling;

// Creating ExceptionHandling class to demonstrate exception handling
public class ExceptionHandling {
    // Dividing two numbers, throwing ArithmeticException if b is zero
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}
