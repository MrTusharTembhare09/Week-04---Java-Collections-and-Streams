package com.example.setinterface.converttosortedlist.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class SetToSortedListUtil {
    // Converting a Set to a sorted List
    public static List<Integer> convertToSortedList(Set<Integer> set) {
        // Creating a list from set
        List<Integer> sortedList = new ArrayList<>(set);

        // Sorting the list in ascending order
        Collections.sort(sortedList);

        return sortedList;
    }
}

