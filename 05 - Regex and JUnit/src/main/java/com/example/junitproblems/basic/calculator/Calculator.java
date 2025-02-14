package com.example.junitproblems.basic.calculator;

// Creating Calculator class with basic arithmetic operations
public class Calculator {

    // Performing addition operation
    public int add(int a, int b) {
        return a + b;
    }

    // Performing subtraction operation
    public int subtract(int a, int b) {
        return a - b;
    }

    // Performing multiplication operation
    public int multiply(int a, int b) {
        return a * b;
    }

    // Performing division operation with exception handling
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero!");
        }
        return a / b;
    }
}
