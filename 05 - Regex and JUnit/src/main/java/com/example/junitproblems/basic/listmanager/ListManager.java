package com.example.junitproblems.basic.listmanager;

import java.util.List;

// Creating ListManager class with list operations
public class ListManager {

    // Adding an element to the list
    public void addElement(List<Integer> list, int element) {
        if (list == null) {
            throw new IllegalArgumentException("List cannot be null");
        }
        list.add(element);
    }

    // Removing an element from the list
    public boolean removeElement(List<Integer> list, int element) {
        if (list == null) {
            throw new IllegalArgumentException("List cannot be null");
        }
        return list.remove(Integer.valueOf(element));
    }

    // Getting the size of the list
    public int getSize(List<Integer> list) {
        if (list == null) {
            throw new IllegalArgumentException("List cannot be null");
        }
        return list.size();
    }
}
