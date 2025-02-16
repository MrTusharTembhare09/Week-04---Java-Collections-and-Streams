package com.example.reflectionproblems.advanced.customobjectmapper.test;

import com.example.reflectionproblems.advanced.customobjectmapper.main.ObjectMapper;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Creating a test class to verify the ObjectMapper functionality.
 */
class ObjectMapperTest {

    /**
     * Creating a sample class to test mapping.
     */
    static class User {
        private String name;
        private int age;

        public String getName() { return name; }
        public int getAge() { return age; }
    }

    /**
     * Testing the toObject() method with a sample User class.
     */
    @Test
    void testToObject() throws ReflectiveOperationException {
        Map<String, Object> properties = new HashMap<>();
        properties.put("name", "John Doe");
        properties.put("age", 30);

        User user = ObjectMapper.toObject(User.class, properties);

        assertEquals("John Doe", user.getName());
        assertEquals(30, user.getAge());
    }
}

