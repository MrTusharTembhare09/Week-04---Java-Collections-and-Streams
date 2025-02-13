package com.example.wordcount.test;

import com.example.wordcount.WordCounter;
import org.junit.jupiter.api.Test;
import java.io.*;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class WordCounterTest {
    @Test
    void testCountWords() throws IOException {
        // Creating test file with sample data
        File tempFile = File.createTempFile("test_word_count", ".txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
            writer.write("apple banana apple\n");
            writer.write("orange banana apple\n");
            writer.write("grape orange grape\n");
        }

        // Running WordCounter on test file
        WordCounter wordCounter = new WordCounter(tempFile.getAbsolutePath());
        Map<String, Integer> wordCountMap = wordCounter.countWords();

        // Validating word count
        assertEquals(3, wordCountMap.get("apple"));  // Apple appears 3 times
        assertEquals(2, wordCountMap.get("banana")); // Banana appears 2 times
        assertEquals(2, wordCountMap.get("orange")); // Orange appears 2 times
        assertEquals(2, wordCountMap.get("grape"));  // Grape appears 2 times
    }

    @Test
    void testGetTopFrequentWords() throws IOException {
        // Creating test file with sample data
        File tempFile = File.createTempFile("test_top_words", ".txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
            writer.write("apple banana apple apple\n");
            writer.write("orange banana apple banana\n");
            writer.write("grape orange grape grape grape\n");
        }

        // Running WordCounter on test file
        WordCounter wordCounter = new WordCounter(tempFile.getAbsolutePath());
        Map<String, Integer> wordCountMap = wordCounter.countWords();
        List<Map.Entry<String, Integer>> topWords = wordCounter.getTopFrequentWords(wordCountMap);

        // Validating top words
        assertFalse(topWords.isEmpty());
        assertEquals("apple", topWords.get(0).getKey()); // Apple should be most frequent
    }
}

