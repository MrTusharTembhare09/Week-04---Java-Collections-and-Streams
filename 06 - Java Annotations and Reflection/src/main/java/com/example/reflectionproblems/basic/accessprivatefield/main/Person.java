package com.example.reflectionproblems.basic.accessprivatefield.main;

/**
 * Class representing a Person with a private age field.
 */
public class Person {
    private int age;

    public Person(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

