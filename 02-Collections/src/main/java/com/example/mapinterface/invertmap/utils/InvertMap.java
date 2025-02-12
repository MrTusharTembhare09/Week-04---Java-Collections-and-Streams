package com.example.mapinterface.invertmap.utils;

import java.util.*;

public class InvertMap {

    // Creating a method to invert a Map<K, V> to Map<V, List<K>>
    public static <K, V> Map<V, List<K>> invertMap(Map<K, V> originalMap) {
        Map<V, List<K>> invertedMap = new HashMap<>();

        // Iterating through each entry in the original map
        for (Map.Entry<K, V> entry : originalMap.entrySet()) {
            V value = entry.getValue();
            K key = entry.getKey();

            // Adding key to the list corresponding to value
            invertedMap.computeIfAbsent(value, k -> new ArrayList<>()).add(key);
        }

        return invertedMap;
    }

    // Testing the function
    public static void main(String[] args) {
        // Creating a sample input map
        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("A", 1);
        inputMap.put("B", 2);
        inputMap.put("C", 1);

        // Inverting the map
        Map<Integer, List<String>> invertedMap = invertMap(inputMap);

        // Printing the inverted map
        System.out.println("Inverted Map: " + invertedMap);
    }
}
