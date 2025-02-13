package com.example.wordcount;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collectors;

public class WordCounter {
    private final String filePath;

    // Creating WordCounter with file path
    public WordCounter(String filePath) {
        this.filePath = filePath;
    }

    // Counting words in the file
    public Map<String, Integer> countWords() {
        Map<String, Integer> wordCountMap = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Splitting words and removing non-alphabetic characters
                String[] words = line.toLowerCase().replaceAll("[^a-zA-Z ]", "").split("\\s+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        return wordCountMap;
    }

    // Getting top 5 frequent words
    public List<Map.Entry<String, Integer>> getTopFrequentWords(Map<String, Integer> wordCountMap) {
        return wordCountMap.entrySet().stream()
                .sorted((a, b) -> b.getValue().compareTo(a.getValue())) // Sorting by frequency (descending)
                .limit(5) // Taking top 5 words
                .collect(Collectors.toList());
    }
}

