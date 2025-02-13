package com.example.userinput.utils;

import java.io.*;

public class UserInputHandler {

    // Reading user input and writing to file
    public static void readAndWriteUserInput(String filePath) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileWriter writer = new FileWriter(filePath, true)) { // Appending mode

            // Asking user for input
            System.out.print("Enter your name: ");
            String name = reader.readLine();

            System.out.print("Enter your age: ");
            String age = reader.readLine();

            System.out.print("Enter your favorite programming language: ");
            String language = reader.readLine();

            // Writing user input to file
            writer.write("Name: " + name + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("Favorite Language: " + language + "\n");
            writer.write("---------------------------\n");

            System.out.println("User information saved successfully!");

        } catch (IOException e) {
            System.out.println("Error occurred while reading input or writing to file: " + e.getMessage());
        }
    }
}

