package com.example.filterstreams.test;

import com.example.filterstreams.utils.TextConverter;
import org.junit.jupiter.api.Test;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

class TextConverterTest {
    private final String inputFilePath = "src/main/resources/input_text.txt";
    private final String outputFilePath = "src/main/resources/output_text.txt";

    @Test
    void testUppercaseToLowercaseConversion() throws IOException {
        // Writing sample uppercase content to input file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(inputFilePath))) {
            writer.write("HELLO WORLD!\n");
            writer.write("JAVA PROGRAMMING\n");
        }

        // Performing conversion
        TextConverter.convertUppercaseToLowercase(inputFilePath, outputFilePath);

        // Reading output file content
        StringBuilder outputContent = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(outputFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                outputContent.append(line).append("\n");
            }
        }

        // Expected lowercase content
        String expectedOutput = "hello world!\njava programming\n";

        // Validating output content
        assertEquals(expectedOutput, outputContent.toString(), "File content does not match expected lowercase conversion!");
    }
}

