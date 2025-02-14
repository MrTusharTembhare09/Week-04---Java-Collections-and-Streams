package com.example.uncheckedexception.main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Asking the user for numerator
            System.out.print("Enter numerator: ");
            double numerator = scanner.nextDouble();

            // Asking the user for denominator
            System.out.print("Enter denominator: ");
            double denominator = scanner.nextDouble();

            // Calling the divide method and printing the result
            double result = DivisionUtility.divideNumbers(numerator, denominator);
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            // Handling division by zero
            System.out.println("Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            // Handling non-numeric input
            System.out.println("Error: Invalid input! Please enter numeric values.");
        } finally {
            // Closing the scanner
            scanner.close();
        }
    }
}

