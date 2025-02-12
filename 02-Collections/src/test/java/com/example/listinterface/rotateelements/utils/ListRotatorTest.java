package com.example.listinterface.rotateelements.utils;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ListRotatorTest {

    @Test
    void testRotateList() {
        // Creating a test list
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        // Rotating the list by 2 positions
        ListRotator.rotateList(numbers, 2);

        // Expected output after rotation
        List<Integer> expected = Arrays.asList(30, 40, 50, 10, 20);

        // Validating the result
        assertEquals(expected, numbers);
    }
}

