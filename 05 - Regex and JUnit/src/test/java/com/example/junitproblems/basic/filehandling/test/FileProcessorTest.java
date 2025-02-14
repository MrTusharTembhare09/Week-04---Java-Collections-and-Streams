package com.example.junitproblems.basic.filehandling.test;

import com.example.junitproblems.basic.filehandling.FileProcessor;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

// Creating JUnit test class for FileProcessor
public class FileProcessorTest {
    private static final String TEST_FILE = "testfile.txt";

    @BeforeEach
    void setup() throws IOException {
        Files.deleteIfExists(Paths.get(TEST_FILE)); // Ensuring clean state before each test
    }

    @Test
    void testWriteAndReadFile() throws IOException {
        String content = "Hello, JUnit!";
        FileProcessor.writeToFile(TEST_FILE, content);
        assertEquals(content, FileProcessor.readFromFile(TEST_FILE));
    }

    @Test
    void testFileExistsAfterWriting() throws IOException {
        FileProcessor.writeToFile(TEST_FILE, "Sample Content");
        assertTrue(Files.exists(Paths.get(TEST_FILE)));
    }

    @Test
    void testReadingNonExistentFileThrowsException() {
        assertThrows(IOException.class, () -> FileProcessor.readFromFile("nonexistent.txt"));
    }

    @AfterEach
    void cleanup() throws IOException {
        Files.deleteIfExists(Paths.get(TEST_FILE)); // Cleaning up after each test
    }
}
