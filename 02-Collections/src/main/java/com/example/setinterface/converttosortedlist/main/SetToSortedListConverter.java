package com.example.setinterface.converttosortedlist.main;

import com.example.setinterface.converttosortedlist.utils.SetToSortedListUtil;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetToSortedListConverter {
    public static void main(String[] args) {
        // Creating a HashSet with some numbers
        Set<Integer> numberSet = new HashSet<>(Arrays.asList(5, 3, 9, 1));

        // Converting set to a sorted list
        List<Integer> sortedList = SetToSortedListUtil.convertToSortedList(numberSet);

        // Printing the sorted list
        System.out.println("Sorted List: " + sortedList);
    }
}
