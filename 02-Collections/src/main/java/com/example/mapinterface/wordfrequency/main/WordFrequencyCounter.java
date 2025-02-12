package com.example.mapinterface.wordfrequency.main;

import com.example.mapinterface.wordfrequency.utils.WordCounter;
import java.util.Map;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        // Provide the correct file path
        String filePath = "src/main/resources/test_sample.txt";

        // Getting word frequency from the file
        Map<String, Integer> wordFrequencies = WordCounter.countWordFrequency(filePath);

        // Displaying the word frequency count
        System.out.println("Word Frequency Count: ");
        wordFrequencies.forEach((word, count) ->
                System.out.println(word + " = " + count)
        );
    }
}

