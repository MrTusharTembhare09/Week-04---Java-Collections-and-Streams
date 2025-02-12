package com.example.mapinterface.bankingsystem.main;

import com.example.mapinterface.bankingsystem.service.BankingSystem;
import com.example.mapinterface.bankingsystem.model.Account;

import java.util.Map;

// Creating a main class to test the banking system
public class BankingSystemMain {
    public static void main(String[] args) {
        // Creating a new banking system instance
        BankingSystem bank = new BankingSystem();

        // Adding accounts
        bank.addAccount("12345", 5000.00);
        bank.addAccount("67890", 2000.00);
        bank.addAccount("54321", 7000.00);

        // Displaying all accounts
        System.out.println("All Accounts: " + bank.getAccounts());

        // Depositing money
        bank.deposit("67890", 1000.00);
        System.out.println("Updated Accounts After Deposit: " + bank.getAccounts());

        // Requesting withdrawals
        bank.requestWithdrawal("12345");
        bank.requestWithdrawal("67890");

        // Processing withdrawals
        bank.processWithdrawal("12345", 1000.00);
        System.out.println("Updated Accounts After Withdrawal: " + bank.getAccounts());

        // Displaying accounts sorted by balance
        System.out.println("Sorted Accounts by Balance: " + bank.getSortedAccounts());
    }
}

