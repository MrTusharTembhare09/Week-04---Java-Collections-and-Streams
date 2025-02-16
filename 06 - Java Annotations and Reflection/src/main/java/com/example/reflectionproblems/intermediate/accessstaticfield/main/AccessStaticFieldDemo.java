package com.example.reflectionproblems.intermediate.accessstaticfield.main;

/**
 * Demonstrates modifying private static fields using Reflection.
 */
public class AccessStaticFieldDemo {
    public static void main(String[] args) {
        // Print the original API key
        System.out.println("Before modification: " + Configuration.getApiKey());

        // Modify API key using Reflection
        StaticFieldModifier.modifyApiKey("NEW_SECRET_KEY");

        // Print the modified API key
        System.out.println("After modification: " + Configuration.getApiKey());
    }
}

