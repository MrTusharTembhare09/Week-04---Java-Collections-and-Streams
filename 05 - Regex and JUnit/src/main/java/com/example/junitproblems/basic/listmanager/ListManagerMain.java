package com.example.junitproblems.basic.listmanager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Creating Main class to test ListManager methods
public class ListManagerMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListManager listManager = new ListManager();
        List<Integer> list = new ArrayList<>();

        System.out.print("Enter number of elements to add: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element: ");
            int element = scanner.nextInt();
            listManager.addElement(list, element);
        }

        System.out.println("Current List: " + list);
        System.out.print("Enter element to remove: ");
        int removeElement = scanner.nextInt();
        listManager.removeElement(list, removeElement);

        System.out.println("Updated List: " + list);
        System.out.println("List Size: " + listManager.getSize(list));
    }
}
