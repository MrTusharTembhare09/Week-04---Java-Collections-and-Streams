package com.example.reflectionproblems.advanced.customobjectmapper.main;

import java.util.HashMap;
import java.util.Map;

/**
 * Running the ObjectMapper with an example.
 */
public class ObjectMapperDemo {
    public static void main(String[] args) throws ReflectiveOperationException {
        // Creating a sample map with properties
        Map<String, Object> properties = new HashMap<>();
        properties.put("name", "Alice");
        properties.put("age", 25);

        // Mapping the properties to a User object
        User user = ObjectMapper.toObject(User.class, properties);

        // Printing the mapped values
        System.out.println("Name: " + user.getName());
        System.out.println("Age: " + user.getAge());
    }

    // Sample User class
    static class User {
        private String name;
        private int age;

        public String getName() { return name; }
        public int getAge() { return age; }
    }
}

