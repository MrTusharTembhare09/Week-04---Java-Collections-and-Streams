package com.example.multiplecatchblocks.main;

import java.util.Scanner;

public class ArrayOperationMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Asking user for array size
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();

            int[] array = new int[size];

            // Asking user to enter elements
            System.out.println("Enter " + size + " elements:");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }

            // Asking user for the index to access
            System.out.print("Enter the index to retrieve value: ");
            int index = scanner.nextInt();

            // Calling getValueAtIndex() method
            String result = ArrayOperations.getValueAtIndex(array, index);
            System.out.println(result);

        } catch (Exception e) {
            // Handling any unexpected exceptions
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            // Closing scanner resource
            scanner.close();
        }
    }
}

