package com.example.annotationsproblems.customannotations.advanced.jsonserialization;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Creating JUnit test class to validate JSON serialization
public class JsonSerializerTest {

    @Test
    void testJsonSerialization() {
        User user = new User("Tushar", 23, "tushar@example.com");
        String jsonString = JsonSerializer.serializeToJson(user);

        // Expected JSON format
        String expectedJson = "{\"user_name\": \"Tushar\", \"user_age\": \"23\", \"user_email\": \"tushar@example.com\"}";
        assertEquals(expectedJson, jsonString);
    }
}

