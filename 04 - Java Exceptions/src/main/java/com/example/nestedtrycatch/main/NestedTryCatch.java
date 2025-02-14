package com.example.nestedtrycatch.main;

public class NestedTryCatch {

    // Performing array division with nested try-catch
    public static String divideElement(int[] arr, int index, int divisor) {
        try {
            // Accessing the array element
            int element = arr[index];

            try {
                // Performing division
                int result = element / divisor;
                return "Result: " + result;
            } catch (ArithmeticException e) {
                return "Cannot divide by zero!";
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            return "Invalid array index!";
        }
    }
}

