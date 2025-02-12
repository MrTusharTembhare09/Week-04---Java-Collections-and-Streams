package com.example.setinterface.findsubsets.utils;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SubsetUtilTest {

    @Test
    public void testIsSubset_TrueCase() {
        // Creating a subset
        Set<Integer> subset = new HashSet<>();
        subset.add(2);
        subset.add(3);

        // Creating a superset
        Set<Integer> superset = new HashSet<>();
        superset.add(1);
        superset.add(2);
        superset.add(3);
        superset.add(4);

        // Checking if subset is contained in superset
        assertTrue(SubsetUtil.isSubset(subset, superset));
    }

    @Test
    public void testIsSubset_FalseCase() {
        // Creating a subset that is not entirely in superset
        Set<Integer> subset = new HashSet<>();
        subset.add(5);
        subset.add(3);

        // Creating a superset
        Set<Integer> superset = new HashSet<>();
        superset.add(1);
        superset.add(2);
        superset.add(3);
        superset.add(4);

        // Checking if subset is contained in superset
        assertFalse(SubsetUtil.isSubset(subset, superset));
    }
}

