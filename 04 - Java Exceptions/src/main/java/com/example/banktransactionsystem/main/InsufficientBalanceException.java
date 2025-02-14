package com.example.banktransactionsystem.main;

// Creating a custom exception for insufficient balance
public class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

