package com.example.annotationsproblems.excercises.overrideexample;

import com.example.annotationsproblems.excercises.overrideexample.Animal;
import com.example.annotationsproblems.excercises.overrideexample.Dog;

public class OverrideExampleMain {
    public static void main(String[] args) {
        // Creating an instance of Dog
        Animal myDog = new Dog();

        // Calling overridden makeSound() method
        myDog.makeSound();
    }
}

