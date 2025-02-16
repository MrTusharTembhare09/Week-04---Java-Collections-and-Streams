package com.example.annotationsproblems.excercises.suppresswarnings;

import java.util.ArrayList;
import java.util.List;

// Creating a class to demonstrate @SuppressWarnings
public class UncheckedWarningExample {

    // Suppressing unchecked warnings for raw type usage
    @SuppressWarnings("unchecked")
    public List getRawList() {
        // Creating an ArrayList without generics
        List rawList = new ArrayList();

        // Adding elements of different types
        rawList.add("Java");
        rawList.add(100);
        rawList.add(true);

        return rawList;
    }

    // Creating a method to print list elements
    public void printList(List list) {
        for (Object item : list) {
            System.out.println(item);
        }
    }
}
