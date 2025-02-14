package com.example.junitproblems.basic.stringutils;

// Creating StringUtils class with utility methods
public class StringUtils {

    // Reversing the given string
    public String reverse(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        return new StringBuilder(str).reverse().toString();
    }

    // Checking if the given string is a palindrome
    public boolean isPalindrome(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        String reversed = reverse(str);
        return str.equalsIgnoreCase(reversed);
    }

    // Converting the given string to uppercase
    public String toUpperCase(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        return str.toUpperCase();
    }
}
