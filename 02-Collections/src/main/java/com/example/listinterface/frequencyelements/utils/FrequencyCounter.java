package com.example.listinterface.frequencyelements.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyCounter {

    // Creating a method to count frequency of elements in a list
    public static Map<String, Integer> countFrequency(List<String> items) {
        Map<String, Integer> frequencyMap = new HashMap<>();

        // Iterating through the list and updating the frequency map
        for (String item : items) {
            frequencyMap.put(item, frequencyMap.getOrDefault(item, 0) + 1);
        }

        // Returning the frequency map
        return frequencyMap;
    }
}

