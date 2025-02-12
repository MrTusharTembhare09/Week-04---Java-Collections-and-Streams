package com.example.mapinterface.wordfrequency.utils;

import org.junit.jupiter.api.Test;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;

class WordCounterTest {

    private static final String TEST_FILE_PATH = "src/main/resources/test_sample.txt";

    // Creating a test file with sample text
    private void createTestFile(String content) {
        try (FileWriter writer = new FileWriter(TEST_FILE_PATH)) {
            writer.write(content);
        } catch (IOException e) {
            throw new RuntimeException("Failed to create test file", e);
        }
    }

    @Test
    void testCountWordFrequency() {
        // Given: Creating a sample test file
        String sampleText = "Hello world, hello Java! Java is fun. HELLO AI.";
        createTestFile(sampleText);

        // When: Counting words from test file
        Map<String, Integer> result = WordCounter.countWordFrequency(TEST_FILE_PATH);

        // Then: Checking expected word frequencies
        assertEquals(3, result.get("hello"));
        assertEquals(1, result.get("world"));
        assertEquals(2, result.get("java"));
        assertEquals(1, result.get("is"));
        assertEquals(1, result.get("fun"));
        assertEquals(1, result.get("ai"));

        // Cleaning up the test file
        try {
            Files.delete(Path.of(TEST_FILE_PATH));
        } catch (IOException e) {
            System.err.println("Failed to delete test file: " + e.getMessage());
        }
    }
}


