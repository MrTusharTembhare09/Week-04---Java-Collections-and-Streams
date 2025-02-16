package com.example.annotationsproblems.excercises.overrideexample;

import com.example.annotationsproblems.excercises.overrideexample.Dog;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class OverrideExampleTest {

    @Test
    void testDogMakeSound() {
        // Redirecting console output to capture the printed statement
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Creating Dog instance and calling makeSound()
        Dog dog = new Dog();
        dog.makeSound();

        // Restoring system output
        System.setOut(System.out);

        // Checking if "Dog barks" is printed
        assertEquals("Dog barks\n", outputStream.toString());
    }
}

