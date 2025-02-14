package com.example.nestedtrycatch.main;

import java.util.Scanner;

public class NestedTryCatchMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking array input
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.print("Enter index: ");
        int index = scanner.nextInt();

        System.out.print("Enter divisor: ");
        int divisor = scanner.nextInt();

        // Calling method and printing result
        String result = NestedTryCatch.divideElement(numbers, index, divisor);
        System.out.println(result);

        // Closing scanner
        scanner.close();
    }
}

