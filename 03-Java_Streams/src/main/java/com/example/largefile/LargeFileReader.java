package com.example.largefile;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class LargeFileReader {
    private final String filePath;

    // Creating LargeFileReader with file path
    public LargeFileReader(String filePath) {
        this.filePath = filePath;
    }

    // Reading file line-by-line and printing lines containing "error"
    public void readAndPrintErrorLines() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Checking if line contains "error" (case-insensitive)
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
