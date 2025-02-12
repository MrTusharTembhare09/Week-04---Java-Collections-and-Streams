package com.example.setinterface.checksetsequality.utils;

import java.util.Set;

public class SetUtils {

    // Creating a method to check if two sets are equal
    public static <T> boolean areSetsEqual(Set<T> set1, Set<T> set2) {
        return set1.equals(set2); // Using built-in equals() method for set comparison
    }
}

