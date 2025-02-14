package com.example.banktransactionsystem.main;

import java.util.Scanner;

public class BankTransactionMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating an account with initial balance
        BankAccount account = new BankAccount(5000);

        try {
            // Taking withdrawal amount input
            System.out.print("Enter withdrawal amount: ");
            double amount = scanner.nextDouble();

            // Performing withdrawal
            String result = account.withdraw(amount);
            System.out.println(result);

        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            // Ensuring scanner is closed
            scanner.close();
            System.out.println("Transaction completed.");
        }
    }
}

