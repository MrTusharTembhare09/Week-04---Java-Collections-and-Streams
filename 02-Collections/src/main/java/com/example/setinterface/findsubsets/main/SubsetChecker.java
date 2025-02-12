package com.example.setinterface.findsubsets.main;

import com.example.setinterface.findsubsets.utils.SubsetUtil;

import java.util.HashSet;
import java.util.Set;

public class SubsetChecker {
    public static void main(String[] args) {
        // Creating two sets
        Set<Integer> subset = new HashSet<>();
        subset.add(2);
        subset.add(3);

        Set<Integer> superset = new HashSet<>();
        superset.add(1);
        superset.add(2);
        superset.add(3);
        superset.add(4);

        // Checking if subset is contained in superset
        boolean isSubset = SubsetUtil.isSubset(subset, superset);

        // Printing the result
        System.out.println("Is subset: " + isSubset);
    }
}


