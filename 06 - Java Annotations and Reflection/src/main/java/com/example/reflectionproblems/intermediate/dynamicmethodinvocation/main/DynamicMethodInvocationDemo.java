package com.example.reflectionproblems.intermediate.dynamicmethodinvocation.main;

import java.util.Scanner;

/**
 * Demonstrates dynamic method invocation using Reflection.
 */
public class DynamicMethodInvocationDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for method selection
        System.out.println("Enter method to invoke (add, subtract, multiply): ");
        String methodName = scanner.nextLine();

        // Taking user input for parameters
        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();

        // Invoking method dynamically
        Object result = MethodInvoker.invokeMethod(methodName, new Class<?>[]{int.class, int.class}, num1, num2);

        // Displaying result
        System.out.println("Result: " + result);
    }
}

