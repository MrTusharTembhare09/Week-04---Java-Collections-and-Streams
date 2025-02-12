package com.example.setinterface.findsubsets.utils;

import java.util.Set;

public class SubsetUtil {
    // Checking if one set is a subset of another
    public static <T> boolean isSubset(Set<T> subset, Set<T> superset) {
        return superset.containsAll(subset);
    }
}

