package com.example.setinterface.checksetsequality.main;

import com.example.setinterface.checksetsequality.utils.SetUtils;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Creating two sets
        Set<Integer> set1 = Set.of(1, 2, 3);
        Set<Integer> set2 = Set.of(3, 2, 1);
        Set<Integer> set3 = Set.of(1, 2, 4);

        // Checking and displaying the results
        System.out.println("Set1 and Set2 are equal: " + SetUtils.areSetsEqual(set1, set2)); // Expected: true
        System.out.println("Set1 and Set3 are equal: " + SetUtils.areSetsEqual(set1, set3)); // Expected: false
    }
}

