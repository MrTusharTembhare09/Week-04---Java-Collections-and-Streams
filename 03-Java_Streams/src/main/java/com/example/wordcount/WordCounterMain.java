package com.example.wordcount;

import java.util.List;
import java.util.Map;

public class WordCounterMain {
    public static void main(String[] args) {
        // Specifying file path (Change this as needed)
        String filePath = "src/main/resources/textfile.txt";

        // Creating WordCounter instance
        WordCounter wordCounter = new WordCounter(filePath);

        // Counting words
        Map<String, Integer> wordCountMap = wordCounter.countWords();

        // Displaying word count
        System.out.println("Total unique words: " + wordCountMap.size());

        // Getting and displaying top 5 frequent words
        List<Map.Entry<String, Integer>> topWords = wordCounter.getTopFrequentWords(wordCountMap);
        System.out.println("Top 5 frequent words:");
        for (Map.Entry<String, Integer> entry : topWords) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

