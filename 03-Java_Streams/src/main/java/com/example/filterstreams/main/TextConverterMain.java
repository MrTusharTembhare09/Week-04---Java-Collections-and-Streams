package com.example.filterstreams.main;

import com.example.filterstreams.utils.TextConverter;

public class TextConverterMain {
    public static void main(String[] args) {
        // Defining input and output file paths
        String inputFilePath = "src/main/resources/input_text.txt";
        String outputFilePath = "src/main/resources/output_text.txt";

        // Converting uppercase letters to lowercase in the file
        TextConverter.convertUppercaseToLowercase(inputFilePath, outputFilePath);
    }
}

