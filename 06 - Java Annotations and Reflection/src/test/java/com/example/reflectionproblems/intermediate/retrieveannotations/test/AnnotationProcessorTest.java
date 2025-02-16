package com.example.reflectionproblems.intermediate.retrieveannotations.test;

import com.example.reflectionproblems.intermediate.retrieveannotations.main.AnnotationProcessor;
import com.example.reflectionproblems.intermediate.retrieveannotations.main.DocumentedClass;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit test for AnnotationProcessor.
 */
class AnnotationProcessorTest {

    @Test
    void testRetrieveAuthorInfo() {
        // Redirect System.out to capture output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Invoke annotation processor
        AnnotationProcessor.retrieveAuthorInfo(DocumentedClass.class);

        // Verify output contains expected author name
        String output = outputStream.toString().trim();
        assertTrue(output.contains("Author: Tushar Tembhare"));
    }
}

