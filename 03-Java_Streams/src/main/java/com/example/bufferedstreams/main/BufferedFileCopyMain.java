package com.example.bufferedstreams.main;

import com.example.bufferedstreams.utils.FileCopyUtil;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class BufferedFileCopyMain {
    public static void main(String[] args) {
        String sourceFile = "src/main/resources/largefile2.txt";  // Ensure this file exists
        String destBuffered = "src/main/resources/copied_buffered2.txt";
        String destUnbuffered = "src/main/resources/copied_unbuffered2.txt";

        try {
            // Checking if source file exists
            if (!Files.exists(Paths.get(sourceFile))) {
                System.out.println("Source file does not exist: " + sourceFile);
                return;
            }

            // Measuring time for Buffered Streams
            long startBuffered = System.nanoTime();
            FileCopyUtil.copyFileWithBuffer(sourceFile, destBuffered);
            long endBuffered = System.nanoTime();
            System.out.println("Buffered Copy Time: " + (endBuffered - startBuffered) / 1_000_000 + " ms");

            // Measuring time for Unbuffered Streams
            long startUnbuffered = System.nanoTime();
            FileCopyUtil.copyFileWithoutBuffer(sourceFile, destUnbuffered);
            long endUnbuffered = System.nanoTime();
            System.out.println("Unbuffered Copy Time: " + (endUnbuffered - startUnbuffered) / 1_000_000 + " ms");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

