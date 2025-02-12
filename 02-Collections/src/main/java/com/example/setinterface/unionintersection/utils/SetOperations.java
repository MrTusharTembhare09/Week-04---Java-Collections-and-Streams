package com.example.setinterface.unionintersection.utils;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {

    // Creating a method to find the union of two sets
    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1); // Creating a new set with set1 elements
        result.addAll(set2); // Adding all elements of set2
        return result;
    }

    // Creating a method to find the intersection of two sets
    public static <T> Set<T> intersection(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1); // Creating a new set with set1 elements
        result.retainAll(set2); // Keeping only common elements
        return result;
    }
}

