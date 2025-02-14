package com.example.checkedexception.test;

import com.example.checkedexception.main.FileReaderUtility;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

public class FileReaderUtilityTest {

    @Test
    void testReadFile_Success() throws IOException {
        String filePath = "test_data.txt"; // Creating a test file
        String expectedContent = "Hello, this is a test file.";

        // Writing test data to the file
        Files.write(Paths.get(filePath), expectedContent.getBytes());

        // Reading and asserting file content
        String actualContent = FileReaderUtility.readFile(filePath);
        assertEquals(expectedContent, actualContent);

        // Deleting test file after execution
        Files.delete(Paths.get(filePath));
    }

    @Test
    void testReadFile_FileNotFound() {
        String filePath = "non_existing_file.txt"; // Non-existing file

        // Asserting IOException is thrown
        assertThrows(IOException.class, () -> FileReaderUtility.readFile(filePath));
    }
}

