package com.example.junitproblems.basic.calculator;

// Creating Main class to test Calculator methods
import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Addition: " + calculator.add(num1, num2));
        System.out.println("Subtraction: " + calculator.subtract(num1, num2));
        System.out.println("Multiplication: " + calculator.multiply(num1, num2));

        try {
            System.out.println("Division: " + calculator.divide(num1, num2));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
