package com.example.largefile.test;

import com.example.largefile.LargeFileReader;
import org.junit.jupiter.api.Test;
import java.io.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

class LargeFileReaderTest {
    @Test
    void testReadAndPrintErrorLines() throws IOException {
        // Creating test file with sample data
        File tempFile = File.createTempFile("test_large_file", ".txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
            writer.write("This is a test file.\n");
            writer.write("An error occurred while processing data.\n");
            writer.write("No issues found here.\n");
            writer.write("Critical ERROR in system logs.\n");
        }

        // Capturing console output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Running LargeFileReader on test file
        LargeFileReader fileReader = new LargeFileReader(tempFile.getAbsolutePath());
        fileReader.readAndPrintErrorLines();

        // Restoring original system output
        System.setOut(System.out);

        // Validating output contains "error" lines
        String consoleOutput = outputStream.toString();
        assertTrue(consoleOutput.contains("error") || consoleOutput.contains("ERROR"), "Filtered output should contain error-related lines.");
    }
}

