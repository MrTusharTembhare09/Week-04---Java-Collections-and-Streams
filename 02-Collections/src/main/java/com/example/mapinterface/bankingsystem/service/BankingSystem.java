package com.example.mapinterface.bankingsystem.service;

import com.example.mapinterface.bankingsystem.model.Account;

import java.util.*;

// Creating a BankingSystem class to manage customer accounts
public class BankingSystem {
    private final Map<String, Account> accounts; // Storing accounts using HashMap
    private final TreeMap<Account, String> sortedAccounts; // Sorting accounts by balance
    private final Queue<String> withdrawalQueue; // Storing withdrawal requests

    // Creating a constructor to initialize data structures
    public BankingSystem() {
        this.accounts = new HashMap<>();
        this.sortedAccounts = new TreeMap<>();
        this.withdrawalQueue = new LinkedList<>();
    }

    // Adding a new account
    public void addAccount(String accountNumber, double initialBalance) {
        Account account = new Account(accountNumber, initialBalance);
        accounts.put(accountNumber, account);
        sortedAccounts.put(account, accountNumber);
    }

    // Depositing money into an account
    public void deposit(String accountNumber, double amount) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            sortedAccounts.remove(account);
            account.deposit(amount);
            sortedAccounts.put(account, accountNumber);
        }
    }

    // Requesting a withdrawal (added to queue)
    public void requestWithdrawal(String accountNumber) {
        if (accounts.containsKey(accountNumber)) {
            withdrawalQueue.add(accountNumber);
        }
    }

    // Processing withdrawals in FIFO order
    public boolean processWithdrawal(String accountNumber, double amount) {
        if (!withdrawalQueue.isEmpty() && withdrawalQueue.peek().equals(accountNumber)) {
            Account account = accounts.get(accountNumber);
            if (account != null && account.withdraw(amount)) {
                withdrawalQueue.poll(); // Removing processed request
                sortedAccounts.remove(account);
                sortedAccounts.put(account, accountNumber);
                return true; // Withdrawal successful
            }
        }
        return false; // Withdrawal failed
    }

    // Getting all accounts
    public Map<String, Account> getAccounts() {
        return accounts;
    }

    // Getting sorted accounts by balance
    public TreeMap<Account, String> getSortedAccounts() {
        return sortedAccounts;
    }

    // Getting withdrawal queue
    public Queue<String> getWithdrawalQueue() {
        return withdrawalQueue;
    }
}

