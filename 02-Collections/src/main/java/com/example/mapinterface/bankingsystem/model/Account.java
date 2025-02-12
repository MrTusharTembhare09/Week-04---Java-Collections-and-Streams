package com.example.mapinterface.bankingsystem.model;

// Creating an Account class to store account details
public class Account implements Comparable<Account> {
    private final String accountNumber;
    private double balance;

    // Creating a constructor to initialize account details
    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getting the account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getting the account balance
    public double getBalance() {
        return balance;
    }

    // Depositing money into the account
    public void deposit(double amount) {
        balance += amount;
    }

    // Withdrawing money from the account
    public boolean withdraw(double amount) {
        if (amount > balance) {
            return false; // Withdrawal failed due to insufficient balance
        }
        balance -= amount;
        return true;
    }

    // Overriding compareTo for sorting accounts by balance
    @Override
    public int compareTo(Account other) {
        return Double.compare(this.balance, other.balance);
    }

    @Override
    public String toString() {
        return "Account{" + "accountNumber='" + accountNumber + "', balance=" + balance + '}';
    }
}

