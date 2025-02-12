package com.example.listinterface.nthfromend.utils;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class LinkedListUtils {

    // Creating a method to find the Nth element from the end using two-pointer approach
    public static <T> T findNthFromEnd(LinkedList<T> list, int n) {
        if (list == null || n <= 0) {
            throw new IllegalArgumentException("Invalid input: List cannot be null and N must be positive.");
        }

        var firstPointer = list.listIterator();  // Creating first pointer
        var secondPointer = list.listIterator(); // Creating second pointer

        // Moving the first pointer N steps ahead
        for (int i = 0; i < n; i++) {
            if (!firstPointer.hasNext()) {
                throw new NoSuchElementException("N is larger than the size of the list.");
            }
            firstPointer.next();
        }

        // Moving both pointers until the first pointer reaches the end
        while (firstPointer.hasNext()) {
            firstPointer.next();
            secondPointer.next();
        }

        // Returning the Nth element from the end
        return secondPointer.next();
    }
}
