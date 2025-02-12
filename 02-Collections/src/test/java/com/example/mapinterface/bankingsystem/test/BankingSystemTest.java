package com.example.mapinterface.bankingsystem.test;

import com.example.mapinterface.bankingsystem.service.BankingSystem;
import com.example.mapinterface.bankingsystem.model.Account;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;
import java.util.Queue;

// Creating a JUnit test class for BankingSystem
public class BankingSystemTest {
    @Test
    public void testBankingSystem() {
        // Creating a new banking system instance
        BankingSystem bank = new BankingSystem();

        // Adding accounts
        bank.addAccount("12345", 5000.00);
        bank.addAccount("67890", 2000.00);
        bank.addAccount("54321", 7000.00);

        // Checking if accounts were added
        assertEquals(3, bank.getAccounts().size());

        // Depositing money
        bank.deposit("67890", 1000.00);
        assertEquals(3000.00, bank.getAccounts().get("67890").getBalance());

        // Requesting withdrawals
        bank.requestWithdrawal("12345");
        bank.requestWithdrawal("67890");

        // Checking withdrawal queue
        Queue<String> withdrawalQueue = bank.getWithdrawalQueue();
        assertEquals("12345", withdrawalQueue.peek());

        // Processing withdrawals
        boolean success = bank.processWithdrawal("12345", 1000.00);
        assertTrue(success);
        assertEquals(4000.00, bank.getAccounts().get("12345").getBalance());

        // Checking if withdrawal request is removed from queue
        assertEquals("67890", withdrawalQueue.peek());
    }
}

