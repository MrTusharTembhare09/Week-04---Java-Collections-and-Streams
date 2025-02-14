package com.example.junitproblems.basic.stringutils;

// Creating Main class to test StringUtils methods
import java.util.Scanner;

public class StringUtilsMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringUtils stringUtils = new StringUtils();

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println("Reversed: " + stringUtils.reverse(input));
        System.out.println("Is Palindrome: " + stringUtils.isPalindrome(input));
        System.out.println("Uppercase: " + stringUtils.toUpperCase(input));
    }
}
