package com.example.banktransactionsystem.test;

import com.example.banktransactionsystem.main.BankAccount;
import com.example.banktransactionsystem.main.InsufficientBalanceException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    @Test
    void testValidWithdrawal() throws InsufficientBalanceException {
        BankAccount account = new BankAccount(5000);
        assertEquals("Withdrawal successful, new balance: 4000.0", account.withdraw(1000));
    }

    @Test
    void testInsufficientBalance() {
        BankAccount account = new BankAccount(500);
        Exception exception = assertThrows(InsufficientBalanceException.class, () -> account.withdraw(1000));
        assertEquals("Insufficient balance!", exception.getMessage());
    }

    @Test
    void testNegativeWithdrawal() {
        BankAccount account = new BankAccount(5000);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> account.withdraw(-100));
        assertEquals("Invalid amount!", exception.getMessage());
    }
}

