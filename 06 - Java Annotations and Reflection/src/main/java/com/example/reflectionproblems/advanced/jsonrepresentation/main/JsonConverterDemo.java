package com.example.reflectionproblems.advanced.jsonrepresentation.main;

/**
 * Running the JsonConverter with an example.
 */
public class JsonConverterDemo {
    public static void main(String[] args) {
        // Creating a sample user object
        User user = new User("Alice", 25, true);

        // Converting to JSON string
        String jsonOutput = JsonConverter.toJson(user);

        // Printing the JSON representation
        System.out.println(jsonOutput);
    }

    // Sample User class
    static class User {
        private String name;
        private int age;
        private boolean isActive;

        public User(String name, int age, boolean isActive) {
            this.name = name;
            this.age = age;
            this.isActive = isActive;
        }
    }
}

