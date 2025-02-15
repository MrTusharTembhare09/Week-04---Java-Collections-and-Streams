package com.example.junitproblems.advanced.banking;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Creating JUnit test class for BankAccount
public class BankAccountTest {
    private BankAccount account;

    @BeforeEach // Setting up before each test
    void setUp() {
        account = new BankAccount(100.0);
    }

    @Test // Testing deposit functionality
    void testDeposit() {
        account.deposit(50.0);
        assertEquals(150.0, account.getBalance(), 0.001);
    }

    @Test // Testing withdrawal functionality
    void testWithdraw() {
        account.withdraw(30.0);
        assertEquals(70.0, account.getBalance(), 0.001);
    }

    @Test // Testing insufficient funds scenario
    void testWithdrawInsufficientFunds() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> account.withdraw(200.0));
        assertEquals("Insufficient funds", exception.getMessage());
    }

    @Test // Testing negative deposit
    void testNegativeDeposit() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> account.deposit(-10.0));
        assertEquals("Deposit amount must be positive", exception.getMessage());
    }

    @Test // Testing negative withdrawal
    void testNegativeWithdraw() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> account.withdraw(-10.0));
        assertEquals("Withdrawal amount must be positive", exception.getMessage());
    }
}
