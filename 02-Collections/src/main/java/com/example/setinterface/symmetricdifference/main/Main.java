package com.example.setinterface.symmetricdifference.main;

import com.example.setinterface.symmetricdifference.utils.SetOperations;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Creating two sets
        Set<Integer> set1 = Set.of(1, 2, 3);
        Set<Integer> set2 = Set.of(3, 4, 5);

        // Calculating symmetric difference
        Set<Integer> symmetricDifferenceSet = SetOperations.symmetricDifference(set1, set2);

        // Displaying result
        System.out.println("Symmetric Difference: " + symmetricDifferenceSet); // Expected: [1, 2, 4, 5]
    }
}

