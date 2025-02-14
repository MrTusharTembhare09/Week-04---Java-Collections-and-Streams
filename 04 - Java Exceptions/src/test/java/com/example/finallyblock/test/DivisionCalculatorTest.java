package com.example.finallyblock.test;

import com.example.finallyblock.main.DivisionCalculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DivisionCalculatorTest {

    @Test
    void testValidDivision() {
        // Testing valid division
        assertEquals(5, DivisionCalculator.divide(10, 2));
    }

    @Test
    void testDivisionByZero() {
        // Testing division by zero returns 0
        assertEquals(0, DivisionCalculator.divide(10, 0));
    }
}

