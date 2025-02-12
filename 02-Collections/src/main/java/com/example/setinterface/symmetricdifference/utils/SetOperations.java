package com.example.setinterface.symmetricdifference.utils;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {

    // Creating a method to find the symmetric difference of two sets
    public static <T> Set<T> symmetricDifference(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1); // Creating a new set with set1 elements
        Set<T> temp = new HashSet<>(set2); // Creating a new set with set2 elements

        result.removeAll(set2); // Removing common elements from set1
        temp.removeAll(set1); // Removing common elements from set2

        result.addAll(temp); // Adding the remaining elements from set2
        return result;
    }
}

