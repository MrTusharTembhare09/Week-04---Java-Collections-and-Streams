package com.example.bufferedstreams.utils;

import java.io.*;

public class FileCopyUtil {

    // Copying a file using Buffered Streams
    public static void copyFileWithBuffer(String sourcePath, String destPath) throws IOException {
        // Creating a buffer of 4KB (4096 bytes)
        byte[] buffer = new byte[4096];
        int bytesRead;

        // Creating Buffered Streams for efficient file reading and writing
        try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(sourcePath));
             BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(destPath))) {

            // Reading and writing in chunks
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
        }
    }

    // Copying a file using normal File Streams (without buffer)
    public static void copyFileWithoutBuffer(String sourcePath, String destPath) throws IOException {
        try (FileInputStream inputStream = new FileInputStream(sourcePath);
             FileOutputStream outputStream = new FileOutputStream(destPath)) {

            int data;
            while ((data = inputStream.read()) != -1) {
                outputStream.write(data);
            }
        }
    }
}

