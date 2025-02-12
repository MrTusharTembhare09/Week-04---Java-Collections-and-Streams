package com.example.setinterface.unionintersection.main;

import com.example.setinterface.unionintersection.utils.SetOperations;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Creating two sets
        Set<Integer> set1 = Set.of(1, 2, 3);
        Set<Integer> set2 = Set.of(3, 4, 5);

        // Calculating union and intersection
        Set<Integer> unionSet = SetOperations.union(set1, set2);
        Set<Integer> intersectionSet = SetOperations.intersection(set1, set2);

        // Displaying results
        System.out.println("Union: " + unionSet);         // Expected: [1, 2, 3, 4, 5]
        System.out.println("Intersection: " + intersectionSet); // Expected: [3]
    }
}

