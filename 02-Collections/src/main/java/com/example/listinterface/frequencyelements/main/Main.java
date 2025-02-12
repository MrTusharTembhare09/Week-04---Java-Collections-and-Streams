package com.example.listinterface.frequencyelements.main;

import com.example.listinterface.frequencyelements.utils.FrequencyCounter;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Creating a sample list
        List<String> items = Arrays.asList("apple", "banana", "apple", "orange");

        // Calling the method to count frequency
        Map<String, Integer> frequencyMap = FrequencyCounter.countFrequency(items);

        // Displaying the frequency map
        System.out.println("Frequency of elements: " + frequencyMap);
    }
}

