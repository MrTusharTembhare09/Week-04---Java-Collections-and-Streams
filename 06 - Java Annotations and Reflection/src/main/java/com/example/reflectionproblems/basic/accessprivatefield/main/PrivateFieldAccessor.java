package com.example.reflectionproblems.basic.accessprivatefield.main;

import java.lang.reflect.Field;

/**
 * Utility class to access and modify private fields using Reflection.
 */
public class PrivateFieldAccessor {

    /**
     * Retrieves the private field value.
     * @param person The Person object
     * @return The age value
     */
    public static int getPrivateAge(Person person) {
        try {
            Field ageField = Person.class.getDeclaredField("age");
            ageField.setAccessible(true); // Allow access to private field
            return (int) ageField.get(person);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException("Error accessing private field: " + e.getMessage());
        }
    }

    /**
     * Modifies the private field value.
     * @param person The Person object
     * @param newAge The new age value
     */
    public static void setPrivateAge(Person person, int newAge) {
        try {
            Field ageField = Person.class.getDeclaredField("age");
            ageField.setAccessible(true); // Allow modification of private field
            ageField.set(person, newAge);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException("Error modifying private field: " + e.getMessage());
        }
    }
}
