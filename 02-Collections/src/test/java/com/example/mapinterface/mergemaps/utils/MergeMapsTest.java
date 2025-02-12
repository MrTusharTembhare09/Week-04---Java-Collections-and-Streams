package com.example.mapinterface.mergemaps.utils;

import org.junit.jupiter.api.Test;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

class MergeMapsTest {

    @Test
    void testMergeMaps() {
        // Given: Two sample input maps
        Map<String, Integer> map1 = Map.of("A", 1, "B", 2);
        Map<String, Integer> map2 = Map.of("B", 3, "C", 4);

        // When: Merging the maps
        Map<String, Integer> mergedResult = MergeMaps.mergeMaps(map1, map2);

        // Then: Verify the output
        assertEquals(Map.of("A", 1, "B", 5, "C", 4), mergedResult);
    }

    @Test
    void testMergeMaps_NoCommonKeys() {
        // Given: Two maps with no common keys
        Map<String, Integer> map1 = Map.of("X", 10);
        Map<String, Integer> map2 = Map.of("Y", 20);

        // When: Merging the maps
        Map<String, Integer> mergedResult = MergeMaps.mergeMaps(map1, map2);

        // Then: Verify the output
        assertEquals(Map.of("X", 10, "Y", 20), mergedResult);
    }

    @Test
    void testMergeMaps_EmptyMaps() {
        // Given: Both maps are empty
        Map<String, Integer> map1 = Map.of();
        Map<String, Integer> map2 = Map.of();

        // When: Merging the maps
        Map<String, Integer> mergedResult = MergeMaps.mergeMaps(map1, map2);

        // Then: Verify the output
        assertTrue(mergedResult.isEmpty());
    }
}

