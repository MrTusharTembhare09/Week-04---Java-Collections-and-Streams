package com.example.filterstreams.utils;

import java.io.*;

public class TextConverter {
    // Converting uppercase letters to lowercase while reading and writing files
    public static void convertUppercaseToLowercase(String inputFilePath, String outputFilePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {

            // Reading line by line and converting to lowercase
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line.toLowerCase()); // Converting to lowercase
                writer.newLine(); // Writing new line
            }
            System.out.println("Writing lowercase content successfully into: " + outputFilePath);
        } catch (IOException e) {
            System.out.println("Error occurred during file processing: " + e.getMessage());
        }
    }
}

