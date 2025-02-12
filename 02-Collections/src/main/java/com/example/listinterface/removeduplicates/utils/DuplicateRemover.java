package com.example.listinterface.removeduplicates.utils;

import java.util.*;

public class DuplicateRemover {

    // Creating a method to remove duplicates while preserving order
    public static <T> List<T> removeDuplicates(List<T> list) {
        Set<T> seen = new HashSet<>();
        List<T> result = new ArrayList<>();

        // Iterating through the list to maintain order while removing duplicates
        for (T item : list) {
            if (seen.add(item)) { // Adding only if not present in the set
                result.add(item);
            }
        }
        return result;
    }
}
