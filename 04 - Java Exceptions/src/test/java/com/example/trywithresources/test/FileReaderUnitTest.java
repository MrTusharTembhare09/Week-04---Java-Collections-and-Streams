package com.example.trywithresources.test;

import com.example.trywithresources.main.FileReaderUtil;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;

public class FileReaderUnitTest {

    @Test
    void testFileExists() throws IOException {
        // Creating a temporary file
        File tempFile = File.createTempFile("info", ".txt");
        tempFile.deleteOnExit();

        // Writing data to the file
        FileWriter writer = new FileWriter(tempFile);
        writer.write("Hello, World!\nThis is a test file.");
        writer.close();

        // Testing if the first line is read correctly
        assertEquals("Hello, World!", FileReaderUtil.readFirstLine(tempFile.getAbsolutePath()));
    }

    @Test
    void testFileNotFound() {
        assertEquals("Error reading file", FileReaderUtil.readFirstLine("nonexistent.txt"));
    }
}

