package com.example.exceptionpropagation.test;

import com.example.exceptionpropagation.main.ExceptionPropagation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExceptionPropagationTest {

    @Test
    void testExceptionPropagation() {
        // Testing if method1() throws ArithmeticException
        Exception exception = assertThrows(ArithmeticException.class, ExceptionPropagation::method2);
        assertEquals("/ by zero", exception.getMessage());
    }
}

