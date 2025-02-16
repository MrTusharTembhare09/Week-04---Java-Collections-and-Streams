package com.example.annotationsproblems.excercises.repeatableannotation;

import com.example.annotationsproblems.excercises.repeatableannotation.utils.AnnotationProcessor;
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
        String expectedOutput = "Bug Reports for buggyMethod:\n- NullPointerException when input is null\n- ArrayIndexOutOfBoundsException when index is too high\n";
        assertTrue(outputStream.toString().contains(expectedOutput.trim()));
    }
}
