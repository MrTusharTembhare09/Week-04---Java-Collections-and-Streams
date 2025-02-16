package com.example.reflectionproblems.basic.dynamicobjectcreation.main;

/**
 * Class representing a Student with name and age attributes.
 */
public class Student {
    private String name;
    private int age;

    // Default constructor
    public Student() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Parameterized constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and toString() for display
    public String getName() { return name; }
    public int getAge() { return age; }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }
}

