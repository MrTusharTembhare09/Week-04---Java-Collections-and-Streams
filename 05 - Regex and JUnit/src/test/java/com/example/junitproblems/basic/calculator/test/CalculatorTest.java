package com.example.junitproblems.basic.calculator.test;

// Creating JUnit test class for Calculator
import com.example.junitproblems.basic.calculator.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    // Creating an instance of Calculator for testing
    private final Calculator calculator = new Calculator();

    @Test
    void testAddition() {
        assertEquals(10, calculator.add(6, 4));
        assertEquals(-2, calculator.add(-1, -1));
    }

    @Test
    void testSubtraction() {
        assertEquals(5, calculator.subtract(10, 5));
        assertEquals(-2, calculator.subtract(3, 5));
    }

    @Test
    void testMultiplication() {
        assertEquals(25, calculator.multiply(5, 5));
        assertEquals(-15, calculator.multiply(3, -5));
    }

    @Test
    void testDivision() {
        assertEquals(2, calculator.divide(10, 5));
        assertEquals(-3, calculator.divide(-9, 3));
    }

    @Test
    void testDivisionByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
        assertEquals("Cannot divide by zero!", exception.getMessage());
    }
}
