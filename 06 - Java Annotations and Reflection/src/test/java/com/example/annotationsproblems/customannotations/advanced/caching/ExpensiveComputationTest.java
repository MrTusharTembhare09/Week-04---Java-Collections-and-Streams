package com.example.annotationsproblems.customannotations.advanced.caching;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Creating JUnit test class for caching system
public class ExpensiveComputationTest {

    @Test
    void testCachingMechanism() {
        ExpensiveComputation computation = new ExpensiveComputation();

        // First call (computes factorial)
        int firstCall = computation.computeFactorial(5);

        // Second call (should return cached result)
        int secondCall = computation.computeFactorial(5);

        // Both results should be the same
        assertEquals(firstCall, secondCall);
    }
}

