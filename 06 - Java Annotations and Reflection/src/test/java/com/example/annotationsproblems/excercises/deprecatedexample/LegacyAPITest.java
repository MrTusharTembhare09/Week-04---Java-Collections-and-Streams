package com.example.annotationsproblems.excercises.deprecatedexample;

import com.example.annotationsproblems.excercises.deprecatedexample.LegacyAPI;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class LegacyAPITest {

    @Test
    void testNewFeature() {
        // Redirecting console output to capture the printed statement
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Creating instance and calling newFeature()
        LegacyAPI api = new LegacyAPI();
        api.newFeature();

        // Restoring system output
        System.setOut(System.out);

        // Checking if the correct message is printed
        assertEquals("This is the new and improved feature.\n", outputStream.toString());
    }
}

