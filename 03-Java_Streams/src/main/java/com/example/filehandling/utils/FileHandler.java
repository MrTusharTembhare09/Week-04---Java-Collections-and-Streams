package com.example.filehandling.utils;

import java.io.*;

public class FileHandler {

    // Reading contents from a file
    public static String readFile(String sourcePath) throws IOException {
        File sourceFile = new File(sourcePath);

        // Checking if the source file exists
        if (!sourceFile.exists()) {
            throw new FileNotFoundException("Source file not found: " + sourcePath);
        }

        StringBuilder content = new StringBuilder();
        try (FileInputStream fis = new FileInputStream(sourceFile);
             BufferedReader reader = new BufferedReader(new InputStreamReader(fis))) {

            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }

        return content.toString();
    }

    // Writing contents to a file
    public static void writeFile(String destinationPath, String content) throws IOException {
        File destinationFile = new File(destinationPath);

        // Creating the file if it doesn't exist
        if (!destinationFile.exists()) {
            destinationFile.createNewFile();
        }

        try (FileOutputStream fos = new FileOutputStream(destinationFile);
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(fos))) {

            writer.write(content);
        }
    }
}

