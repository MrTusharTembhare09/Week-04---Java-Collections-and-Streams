package com.example.throwvsthrows.main;

public class InterestCalculator {

    // Calculating simple interest and propagating exceptions
    public static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {
        // Checking for negative values and throwing exception
        if (amount < 0 || rate < 0) {
            throw new IllegalArgumentException("Amount and rate must be positive");
        }
        // Calculating interest
        return (amount * rate * years) / 100;
    }
}

