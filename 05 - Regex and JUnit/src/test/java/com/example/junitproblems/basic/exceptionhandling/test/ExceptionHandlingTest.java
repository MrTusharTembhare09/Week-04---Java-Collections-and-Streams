package com.example.junitproblems.basic.exceptionhandling.test;

import com.example.junitproblems.basic.exceptionhandling.ExceptionHandling;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Creating JUnit test class for ExceptionHandling
public class ExceptionHandlingTest {
    @Test
    void testDivideByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> ExceptionHandling.divide(10, 0));
        assertEquals("Cannot divide by zero", exception.getMessage());
    }

    @Test
    void testValidDivision() {
        assertEquals(5, ExceptionHandling.divide(10, 2));
    }
}

