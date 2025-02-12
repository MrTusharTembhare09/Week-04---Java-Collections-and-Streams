package com.example.listinterface.reversealist.main;

import com.example.listinterface.reversealist.utils.ListReverser;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creating an ArrayList
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            arrayList.add(i);
        }

        // Printing the original ArrayList
        System.out.println("Original ArrayList: " + arrayList);

        // Reversing the ArrayList
        ListReverser.reverseList(arrayList);
        System.out.println("Reversed ArrayList: " + arrayList);

        // Creating a LinkedList
        List<Integer> linkedList = new LinkedList<>(arrayList);

        // Reversing the LinkedList
        ListReverser.reverseList(linkedList);
        System.out.println("Reversed LinkedList: " + linkedList);
    }
}

