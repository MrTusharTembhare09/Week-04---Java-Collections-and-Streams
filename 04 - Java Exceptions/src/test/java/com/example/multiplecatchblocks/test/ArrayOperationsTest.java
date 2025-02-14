package com.example.multiplecatchblocks.test;

import com.example.multiplecatchblocks.main.ArrayOperations;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayOperationsTest {

    @Test
    void testValidIndex() {
        int[] array = {10, 20, 30, 40, 50};
        assertEquals("Value at index 2: 30", ArrayOperations.getValueAtIndex(array, 2));
    }

    @Test
    void testInvalidIndex() {
        int[] array = {10, 20, 30};
        assertEquals("Invalid index!", ArrayOperations.getValueAtIndex(array, 5));
    }

    @Test
    void testNullArray() {
        int[] array = null;
        assertEquals("Array is not initialized!", ArrayOperations.getValueAtIndex(array, 1));
    }
}

