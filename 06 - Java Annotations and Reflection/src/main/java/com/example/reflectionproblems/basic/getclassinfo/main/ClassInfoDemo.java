package com.example.reflectionproblems.basic.getclassinfo.main;

import java.util.Scanner;

/**
 * Demo class to test ClassInfoRetriever.
 */
public class ClassInfoDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the fully qualified class name: ");
        String className = scanner.nextLine();

        ClassInfoRetriever.printClassInfo(className);

        scanner.close();
    }
}

