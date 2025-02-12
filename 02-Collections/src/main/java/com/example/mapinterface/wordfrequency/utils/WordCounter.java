package com.example.mapinterface.wordfrequency.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordCounter {

    // Counting word frequencies from a text file
    public static Map<String, Integer> countWordFrequency(String filePath) {
        Map<String, Integer> wordFrequencyMap = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                // Normalize text: convert to lowercase, remove punctuation, split by spaces
                String[] words = line.toLowerCase().replaceAll("[^a-zA-Z ]", "").split("\\s+");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }

        return wordFrequencyMap;
    }
}

