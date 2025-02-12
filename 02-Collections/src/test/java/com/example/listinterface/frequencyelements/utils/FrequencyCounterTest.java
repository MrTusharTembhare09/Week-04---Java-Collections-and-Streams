package com.example.listinterface.frequencyelements.utils;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FrequencyCounterTest {

    @Test
    void testCountFrequency() {
        // Creating a test list
        List<String> items = Arrays.asList("apple", "banana", "apple", "orange");

        // Calling the method to count frequency
        Map<String, Integer> result = FrequencyCounter.countFrequency(items);

        // Validating the results
        assertEquals(2, result.get("apple"));
        assertEquals(1, result.get("banana"));
        assertEquals(1, result.get("orange"));
    }
}
