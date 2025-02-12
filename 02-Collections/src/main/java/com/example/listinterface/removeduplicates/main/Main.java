package com.example.listinterface.removeduplicates.main;

import com.example.listinterface.removeduplicates.utils.DuplicateRemover;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creating a sample list with duplicates
        List<Integer> numbers = Arrays.asList(3, 1, 2, 2, 3, 4);

        // Displaying the original list
        System.out.println("Original List: " + numbers);

        // Removing duplicates while preserving order
        List<Integer> uniqueNumbers = DuplicateRemover.removeDuplicates(numbers);

        // Displaying the list after removing duplicates
        System.out.println("List After Removing Duplicates: " + uniqueNumbers);
    }
}

