package com.example.bufferedstreams.test;

import com.example.bufferedstreams.utils.FileCopyUtil;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertTrue;

class FileCopyTest {

    private final String sourceFile = "src/main/resources/largefile2.txt";
    private final String destBuffered = "src/main/resources/copied_buffered2.txt";
    private final String destUnbuffered = "src/main/resources/copied_unbuffered2.txt";

    @Test
    void testCopyFileWithBuffer() throws IOException {
        // Creating test file if not exists
        if (!Files.exists(Paths.get(sourceFile))) {
            Files.writeString(Paths.get(sourceFile), "This is a test file for buffered copy.");
        }

        // Performing file copy
        FileCopyUtil.copyFileWithBuffer(sourceFile, destBuffered);

        // Checking if destination file is created
        assertTrue(new File(destBuffered).exists(), "Buffered copy failed!");
    }

    @Test
    void testCopyFileWithoutBuffer() throws IOException {
        // Creating test file if not exists
        if (!Files.exists(Paths.get(sourceFile))) {
            Files.writeString(Paths.get(sourceFile), "This is a test file for unbuffered copy.");
        }

        // Performing file copy
        FileCopyUtil.copyFileWithoutBuffer(sourceFile, destUnbuffered);

        // Checking if destination file is created
        assertTrue(new File(destUnbuffered).exists(), "Unbuffered copy failed!");
    }
}

