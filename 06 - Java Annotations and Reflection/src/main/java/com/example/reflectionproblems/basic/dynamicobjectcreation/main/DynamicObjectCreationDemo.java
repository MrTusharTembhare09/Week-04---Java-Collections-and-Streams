package com.example.reflectionproblems.basic.dynamicobjectcreation.main;

/**
 * Demonstrates dynamic object creation using Reflection.
 */
public class DynamicObjectCreationDemo {
    public static void main(String[] args) {
        // Class name to be instantiated dynamically
        String className = "com.example.reflectionproblems.basic.dynamicobjectcreation.main.Student";

        // Create object dynamically
        Object student = ObjectCreator.createInstance(className);

        // Display the created object
        System.out.println("Dynamically Created Object: " + student);
    }
}

