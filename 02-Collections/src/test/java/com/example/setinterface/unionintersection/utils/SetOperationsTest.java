package com.example.setinterface.unionintersection.utils;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class SetOperationsTest {

    @Test
    void testUnion() {
        // Creating test sets
        Set<Integer> set1 = new HashSet<>(Set.of(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Set.of(3, 4, 5));

        // Calculating union
        Set<Integer> expectedUnion = Set.of(1, 2, 3, 4, 5);
        assertEquals(expectedUnion, SetOperations.union(set1, set2));
    }

    @Test
    void testIntersection() {
        // Creating test sets
        Set<Integer> set1 = new HashSet<>(Set.of(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Set.of(3, 4, 5));

        // Calculating intersection
        Set<Integer> expectedIntersection = Set.of(3);
        assertEquals(expectedIntersection, SetOperations.intersection(set1, set2));
    }

    @Test
    void testUnionWithEmptySet() {
        // Creating test sets
        Set<Integer> set1 = new HashSet<>(Set.of(1, 2, 3));
        Set<Integer> set2 = new HashSet<>();

        // Union should return set1 as it is
        assertEquals(set1, SetOperations.union(set1, set2));
    }

    @Test
    void testIntersectionWithEmptySet() {
        // Creating test sets
        Set<Integer> set1 = new HashSet<>(Set.of(1, 2, 3));
        Set<Integer> set2 = new HashSet<>();

        // Intersection should return an empty set
        assertTrue(SetOperations.intersection(set1, set2).isEmpty());
    }
}

