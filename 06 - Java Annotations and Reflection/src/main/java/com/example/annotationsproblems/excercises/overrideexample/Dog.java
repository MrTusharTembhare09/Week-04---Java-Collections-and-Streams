package com.example.annotationsproblems.excercises.overrideexample;

// Creating a subclass Dog that extends Animal
public class Dog extends Animal {
    // Overriding makeSound() method with @Override annotation
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

