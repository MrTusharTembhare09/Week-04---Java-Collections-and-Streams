package com.example.setinterface.checksetsequality.utils;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class SetUtilsTest {

    @Test
    void testAreSetsEqual_SameElements() {
        // Creating test sets
        Set<Integer> set1 = new HashSet<>(Set.of(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Set.of(3, 2, 1));

        // Validating equality
        assertTrue(SetUtils.areSetsEqual(set1, set2));
    }

    @Test
    void testAreSetsEqual_DifferentElements() {
        // Creating test sets
        Set<Integer> set1 = new HashSet<>(Set.of(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Set.of(1, 2, 4));

        // Validating inequality
        assertFalse(SetUtils.areSetsEqual(set1, set2));
    }

    @Test
    void testAreSetsEqual_EmptySets() {
        // Creating empty sets
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Validating empty set equality
        assertTrue(SetUtils.areSetsEqual(set1, set2));
    }
}

