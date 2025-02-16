package com.example.annotationsproblems.excercises.suppresswarnings;

import java.util.List;

public class SuppressWarningsMain {
    public static void main(String[] args) {
        // Creating an instance of UncheckedWarningExample
        UncheckedWarningExample example = new UncheckedWarningExample();

        // Calling method to get raw list (unchecked warning suppressed)
        List rawList = example.getRawList();

        // Printing the elements of the raw list
        example.printList(rawList);
    }
}

