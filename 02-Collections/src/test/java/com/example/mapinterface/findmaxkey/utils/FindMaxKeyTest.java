package com.example.mapinterface.findmaxkey.utils;

import org.junit.jupiter.api.Test;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

class FindMaxKeyTest {

    @Test
    void testFindKeyWithMaxValue() {
        // Given: A sample input map
        Map<String, Integer> inputMap = Map.of("A", 10, "B", 20, "C", 15);

        // When: Finding the key with the maximum value
        String maxKey = FindMaxKey.findKeyWithMaxValue(inputMap);

        // Then: Verify the output
        assertEquals("B", maxKey);
    }

    @Test
    void testFindKeyWithMaxValue_SingleEntry() {
        // Given: A map with a single entry
        Map<String, Integer> inputMap = Map.of("X", 100);

        // When: Finding the key with the maximum value
        String maxKey = FindMaxKey.findKeyWithMaxValue(inputMap);

        // Then: Verify the output
        assertEquals("X", maxKey);
    }

    @Test
    void testFindKeyWithMaxValue_EmptyMap() {
        // Given: An empty map
        Map<String, Integer> inputMap = Map.of();

        // Then: Expect an exception
        assertThrows(IllegalArgumentException.class, () -> FindMaxKey.findKeyWithMaxValue(inputMap));
    }
}

