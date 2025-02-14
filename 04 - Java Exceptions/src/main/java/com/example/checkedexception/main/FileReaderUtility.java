package com.example.checkedexception.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderUtility {

    // Reading the file and returning its contents
    public static String readFile(String filePath) throws IOException {
        StringBuilder content = new StringBuilder();

        // Creating BufferedReader to read file
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            // Reading each line and appending to content
            while ((line = br.readLine()) != null) {
                content.append(line).append("\n");
            }
        }

        return content.toString().trim(); // Returning trimmed content
    }
}

