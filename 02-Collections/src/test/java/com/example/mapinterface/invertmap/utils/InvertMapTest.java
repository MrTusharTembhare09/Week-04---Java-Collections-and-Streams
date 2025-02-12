package com.example.mapinterface.invertmap.utils;

import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class InvertMapTest {

    @Test
    void testInvertMap() {
        // Given: A sample input map
        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("A", 1);
        inputMap.put("B", 2);
        inputMap.put("C", 1);

        // When: Inverting the map
        Map<Integer, List<String>> expectedMap = new HashMap<>();
        expectedMap.put(1, Arrays.asList("A", "C"));
        expectedMap.put(2, Collections.singletonList("B"));

        Map<Integer, List<String>> actualMap = InvertMap.invertMap(inputMap);

        // Then: Verify the output
        assertEquals(expectedMap.size(), actualMap.size());
        assertTrue(actualMap.containsKey(1));
        assertTrue(actualMap.containsKey(2));
        assertEquals(expectedMap.get(1), actualMap.get(1));
        assertEquals(expectedMap.get(2), actualMap.get(2));
    }
}

