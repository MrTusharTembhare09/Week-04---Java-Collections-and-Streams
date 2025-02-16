package com.example.annotationsproblems.customannotations.bigginerlevel.importantmethod;

import com.example.annotationsproblems.customannotations.bigginerlevel.importantmethod.AnnotationProcessor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class AnnotationProcessorTest {

    @Test
    void testAnnotationProcessing() {
        // Redirecting console output to capture the printed statement
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Processing annotations
        AnnotationProcessor.processAnnotations();

        // Restoring system output
        System.setOut(System.out);

        // Checking if the correct output is printed
        String expectedOutput = "Important Methods in CriticalOperations class:\n" +
                "- processTransaction (Level: HIGH)\n" +
                "- generateReport (Level: MEDIUM)";

        assertTrue(outputStream.toString().contains(expectedOutput.trim()));
    }
}

