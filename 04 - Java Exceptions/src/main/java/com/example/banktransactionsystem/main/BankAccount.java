package com.example.banktransactionsystem.main;

public class BankAccount {
    private double balance;

    // Creating a constructor to initialize balance
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Performing withdrawal operation with exception handling
    public String withdraw(double amount) throws InsufficientBalanceException {
        if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount!");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }

        // Deducting amount from balance
        balance -= amount;
        return "Withdrawal successful, new balance: " + balance;
    }

    // Retrieving the current balance
    public double getBalance() {
        return balance;
    }
}
