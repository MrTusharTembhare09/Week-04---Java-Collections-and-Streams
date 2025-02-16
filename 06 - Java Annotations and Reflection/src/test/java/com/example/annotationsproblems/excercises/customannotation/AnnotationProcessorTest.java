package com.example.annotationsproblems.excercises.customannotation;

import com.example.annotationsproblems.excercises.customannotation.AnnotationProcessor;
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
        String expectedOutput = "Task Priority: High\nAssigned To: John Doe\n";
        assertTrue(outputStream.toString().contains(expectedOutput.trim()));
    }
}

