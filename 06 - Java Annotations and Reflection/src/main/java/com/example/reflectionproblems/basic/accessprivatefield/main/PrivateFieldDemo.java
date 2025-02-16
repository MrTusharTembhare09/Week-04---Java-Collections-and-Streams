package com.example.reflectionproblems.basic.accessprivatefield.main;

/**
 * Demonstrates accessing and modifying private fields using Reflection.
 */
public class PrivateFieldDemo {
    public static void main(String[] args) {
        // Creating Person object with age 25
        Person person = new Person(25);

        // Accessing private field
        int ageBefore = PrivateFieldAccessor.getPrivateAge(person);
        System.out.println("Before Modification: Age = " + ageBefore);

        // Modifying private field
        PrivateFieldAccessor.setPrivateAge(person, 30);

        // Verifying modification
        int ageAfter = PrivateFieldAccessor.getPrivateAge(person);
        System.out.println("After Modification: Age = " + ageAfter);
    }
}

