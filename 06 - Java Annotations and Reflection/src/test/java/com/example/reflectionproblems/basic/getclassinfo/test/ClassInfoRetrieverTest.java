package com.example.reflectionproblems.basic.getclassinfo.test;

import com.example.reflectionproblems.basic.getclassinfo.main.ClassInfoRetriever;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

/**
 * Unit test for Class Information Retrieval.
 */
class ClassInfoRetrieverTest {

    @Test
    void testValidClassInfoRetrieval() {
        // Ensure class retrieval does not throw exceptions
        assertDoesNotThrow(() -> ClassInfoRetriever.printClassInfo("java.lang.String"));
    }

    @Test
    void testInvalidClassInfoRetrieval() {
        // Ensure invalid class name does not crash program
        assertDoesNotThrow(() -> ClassInfoRetriever.printClassInfo("com.unknown.NonExistentClass"));
    }
}

