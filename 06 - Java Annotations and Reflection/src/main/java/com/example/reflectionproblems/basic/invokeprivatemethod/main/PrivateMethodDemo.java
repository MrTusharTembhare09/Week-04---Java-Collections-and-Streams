package com.example.reflectionproblems.basic.invokeprivatemethod.main;

/**
 * Demonstrates invoking a private method using Reflection.
 */
public class PrivateMethodDemo {
    public static void main(String[] args) {
        // Creating Calculator object
        Calculator calculator = new Calculator();

        // Invoking private method using Reflection
        int result = PrivateMethodInvoker.invokeMultiply(calculator, 5, 3);

        // Displaying the result
        System.out.println("Multiplication Result: " + result);
    }
}

