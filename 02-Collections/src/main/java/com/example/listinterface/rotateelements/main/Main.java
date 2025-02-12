package com.example.listinterface.rotateelements.main;

import com.example.listinterface.rotateelements.utils.ListRotator;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creating a sample list
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        // Defining the number of positions to rotate
        int positions = 2;

        // Displaying the original list
        System.out.println("Original List: " + numbers);

        // Rotating the list
        ListRotator.rotateList(numbers, positions);

        // Displaying the rotated list
        System.out.println("Rotated List: " + numbers);
    }
}
