package com.example.multiplecatchblocks.main;

public class ArrayOperations {

    // Retrieving value at a given index with exception handling
    public static String getValueAtIndex(int[] array, int index) {
        try {
            // Accessing the element at the given index
            int value = array[index];
            return "Value at index " + index + ": " + value;
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handling index out of bounds exception
            return "Invalid index!";
        } catch (NullPointerException e) {
            // Handling null array reference
            return "Array is not initialized!";
        }
    }
}

