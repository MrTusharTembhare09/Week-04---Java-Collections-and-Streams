package com.example.listinterface.nthfromend.main;

import com.example.listinterface.nthfromend.utils.LinkedListUtils;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creating a linked list
        LinkedList<String> list = new LinkedList<>(List.of("A", "B", "C", "D", "E"));

        // Displaying the original list
        System.out.println("Original List: " + list);

        int n = 2; // Finding the 2nd element from the end

        // Finding and displaying the Nth element from the end
        System.out.println("The " + n + "th element from the end is: " + LinkedListUtils.findNthFromEnd(list, n));
    }
}

