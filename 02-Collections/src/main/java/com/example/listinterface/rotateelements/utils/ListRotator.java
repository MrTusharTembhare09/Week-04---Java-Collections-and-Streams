package com.example.listinterface.rotateelements.utils;

import java.util.List;
import java.util.Collections;

public class ListRotator {

    // Creating a method to rotate the list by a given number of positions
    public static <T> void rotateList(List<T> list, int positions) {
        int size = list.size();
        if (size == 0) return; // Avoid division by zero

        // Normalizing the number of positions in case it's greater than list size
        positions = positions % size;

        // Rotating the list by shifting elements
        Collections.rotate(list, -positions); // Negative for left rotation
    }
}

