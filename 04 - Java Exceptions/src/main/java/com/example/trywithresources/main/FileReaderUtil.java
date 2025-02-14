package com.example.trywithresources.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderUtil {

    // Reading the first line of a file using try-with-resources
    public static String readFirstLine(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            // Reading the first line of the file
            return reader.readLine();
        } catch (IOException e) {
            // Handling file-related exceptions
            return "Error reading file";
        }
    }
}

