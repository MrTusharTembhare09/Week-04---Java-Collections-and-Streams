package com.example.filehandling.main;

import com.example.filehandling.utils.FileHandler;

public class FileHandlingMain {
    public static void main(String[] args) {
        String sourceFilePath = "src/main/resources/sourceP1.txt";
        String destinationFilePath = "src/main/resources/destinationP1.txt";

        try {
            // Reading from source file
            String content = FileHandler.readFile(sourceFilePath);
            System.out.println("File Read Successfully!");

            // Writing to destination file
            FileHandler.writeFile(destinationFilePath, content);
            System.out.println("File Written Successfully!");

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

