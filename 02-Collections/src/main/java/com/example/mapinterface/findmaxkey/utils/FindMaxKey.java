package com.example.mapinterface.findmaxkey.utils;

import java.util.Collections;
import java.util.Map;

public class FindMaxKey {

    // Creating a method to find the key with the highest value
    public static String findKeyWithMaxValue(Map<String, Integer> map) {
        if (map == null || map.isEmpty()) {
            throw new IllegalArgumentException("Map cannot be null or empty");
        }

        // Finding the entry with the maximum value
        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }

    // Testing the function
    public static void main(String[] args) {
        // Creating a sample input map
        Map<String, Integer> inputMap = Map.of("A", 10, "B", 20, "C", 15);

        // Finding the key with the highest value
        String maxKey = findKeyWithMaxValue(inputMap);

        // Printing the result
        System.out.println("Key with the highest value: " + maxKey);
    }
}

