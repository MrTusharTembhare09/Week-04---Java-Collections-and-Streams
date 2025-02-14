package com.example.throwvsthrows.test;

import com.example.throwvsthrows.main.InterestCalculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InterestCalculatorTest {

    @Test
    void testValidInterestCalculation() {
        // Testing valid input
        assertEquals(100.0, InterestCalculator.calculateInterest(1000, 5, 2));
    }

    @Test
    void testNegativeAmount() {
        // Testing negative amount throws IllegalArgumentException
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            InterestCalculator.calculateInterest(-1000, 5, 2);
        });
        assertEquals("Amount and rate must be positive", exception.getMessage());
    }

    @Test
    void testNegativeRate() {
        // Testing negative rate throws IllegalArgumentException
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            InterestCalculator.calculateInterest(1000, -5, 2);
        });
        assertEquals("Amount and rate must be positive", exception.getMessage());
    }
}

