package com.example.setinterface.symmetricdifference.utils;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class SetOperationsTest {

    @Test
    void testSymmetricDifference() {
        // Creating test sets
        Set<Integer> set1 = new HashSet<>(Set.of(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Set.of(3, 4, 5));

        // Expected result
        Set<Integer> expectedSymmetricDifference = Set.of(1, 2, 4, 5);

        // Asserting the result
        assertEquals(expectedSymmetricDifference, SetOperations.symmetricDifference(set1, set2));
    }

    @Test
    void testSymmetricDifferenceWithEmptySet() {
        // Creating test sets
        Set<Integer> set1 = new HashSet<>(Set.of(1, 2, 3));
        Set<Integer> set2 = new HashSet<>();

        // Symmetric difference should be the same as set1
        assertEquals(set1, SetOperations.symmetricDifference(set1, set2));
    }

    @Test
    void testSymmetricDifferenceWhenBothSetsAreEqual() {
        // Creating test sets
        Set<Integer> set1 = new HashSet<>(Set.of(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Set.of(1, 2, 3));

        // Symmetric difference should be an empty set
        assertTrue(SetOperations.symmetricDifference(set1, set2).isEmpty());
    }
}


