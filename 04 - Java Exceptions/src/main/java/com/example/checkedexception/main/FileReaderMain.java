package com.example.checkedexception.main;

import java.io.IOException;

public class FileReaderMain {
    public static void main(String[] args) {
        String filePath = "src/main/resources/data.txt"; // Defining file path

        try {
            // Calling method to read file and printing contents
            String content = FileReaderUtility.readFile(filePath);
            System.out.println("File Content:\n" + content);
        } catch (IOException e) {
            // Handling IOException and displaying friendly message
            System.out.println("File not found");
        }
    }
}

