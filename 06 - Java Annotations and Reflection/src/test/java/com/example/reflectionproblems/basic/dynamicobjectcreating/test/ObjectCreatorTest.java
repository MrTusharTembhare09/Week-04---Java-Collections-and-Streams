package com.example.reflectionproblems.basic.dynamicobjectcreation.test;

import com.example.reflectionproblems.basic.dynamicobjectcreation.main.ObjectCreator;
import com.example.reflectionproblems.basic.dynamicobjectcreation.main.Student;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for ObjectCreator.
 */
class ObjectCreatorTest {

    @Test
    void testCreateInstance() {
        String className = "com.example.reflectionproblems.basic.dynamicobjectcreation.main.Student";

        // Create object dynamically
        Object obj = ObjectCreator.createInstance(className);

        // Verify that object is an instance of Student
        assertNotNull(obj);
        assertTrue(obj instanceof Student);

        // Verify default values
        Student student = (Student) obj;
        assertEquals("Unknown", student.getName());
        assertEquals(0, student.getAge());
    }
}

