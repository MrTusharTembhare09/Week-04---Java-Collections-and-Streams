package com.example.reflectionproblems.advanced.jsonrepresentation.test;

import com.example.reflectionproblems.advanced.jsonrepresentation.main.JsonConverter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Creating a test class to verify JSON conversion.
 */
class JsonConverterTest {

    /**
     * Creating a sample class to test JSON conversion.
     */
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

    /**
     * Testing toJson() method for correct JSON conversion.
     */
    @Test
    void testToJson() {
        User user = new User("John Doe", 30, true);
        String expectedJson = "{\"name\": \"John Doe\", \"age\": 30, \"isActive\": true}";

        assertEquals(expectedJson, JsonConverter.toJson(user));
    }
}

