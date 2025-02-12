package com.example.mapinterface.mergemaps.utils;

import java.util.HashMap;
import java.util.Map;

public class MergeMaps {

    // Creating a method to merge two maps and sum values of common keys
    public static Map<String, Integer> mergeMaps(Map<String, Integer> map1, Map<String, Integer> map2) {
        // Creating a new map to store the merged result
        Map<String, Integer> mergedMap = new HashMap<>(map1);

        // Iterating through the second map and merging values
        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            mergedMap.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }

        return mergedMap;
    }

    // Testing the function
    public static void main(String[] args) {
        // Creating sample input maps
        Map<String, Integer> map1 = Map.of("A", 1, "B", 2);
        Map<String, Integer> map2 = Map.of("B", 3, "C", 4);

        // Merging the maps
        Map<String, Integer> mergedResult = mergeMaps(map1, map2);

        // Printing the result
        System.out.println("Merged Map: " + mergedResult);
    }
}

