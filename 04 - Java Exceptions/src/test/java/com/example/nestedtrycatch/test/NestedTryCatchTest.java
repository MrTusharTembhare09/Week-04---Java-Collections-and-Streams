package com.example.nestedtrycatch.test;

import com.example.nestedtrycatch.main.NestedTryCatch;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NestedTryCatchTest {

    @Test
    void testValidDivision() {
        int[] arr = {10, 20, 30, 40, 50};
        assertEquals("Result: 5", NestedTryCatch.divideElement(arr, 1, 4));
    }

    @Test
    void testDivisionByZero() {
        int[] arr = {10, 20, 30, 40, 50};
        assertEquals("Cannot divide by zero!", NestedTryCatch.divideElement(arr, 2, 0));
    }

    @Test
    void testInvalidIndex() {
        int[] arr = {10, 20, 30, 40, 50};
        assertEquals("Invalid array index!", NestedTryCatch.divideElement(arr, 10, 2));
    }
}

