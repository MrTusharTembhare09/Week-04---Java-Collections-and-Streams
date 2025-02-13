package com.example.filehandling.test;

import com.example.filehandling.utils.FileHandler;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;

public class FileHandlerTest {

    @Test
    void testReadAndWriteFile() throws IOException {
        String source = "src/main/resources/sourceP1.txt";
        String destination = "src/main/resources/destinationP1.txt";
        String sampleContent = "This is a test content.\n";

        // Writing sample content to source file
        FileHandler.writeFile(source, sampleContent);

        // Reading back to check if written correctly
        String readContent = FileHandler.readFile(source);

        // Verifying if contents match
        assertEquals(sampleContent, readContent);

        // Writing to destination file
        FileHandler.writeFile(destination, readContent);

        // Reading destination file to verify content
        String destinationContent = FileHandler.readFile(destination);
        assertEquals(sampleContent, destinationContent);
    }
}

