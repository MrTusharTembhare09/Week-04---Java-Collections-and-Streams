package com.example.uncheckedexception.test;

import com.example.uncheckedexception.main.DivisionUtility;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DivisionUtilityTest {

    @Test
    void testValidDivision() {
        // Checking correct division
        assertEquals(2.0, DivisionUtility.divideNumbers(10, 5));
    }

    @Test
    void testDivisionByZero() {
        // Checking if ArithmeticException is thrown
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            DivisionUtility.divideNumbers(10, 0);
        });
        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}

