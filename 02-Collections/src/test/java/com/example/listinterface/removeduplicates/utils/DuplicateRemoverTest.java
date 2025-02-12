package com.example.listinterface.removeduplicates.utils;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DuplicateRemoverTest {

    @Test
    void testRemoveDuplicates() {
        // Creating a test list with duplicates
        List<Integer> numbers = Arrays.asList(3, 1, 2, 2, 3, 4);

        // Expected output after removing duplicates
        List<Integer> expected = Arrays.asList(3, 1, 2, 4);

        // Validating the result
        assertEquals(expected, DuplicateRemover.removeDuplicates(numbers));
    }
}

