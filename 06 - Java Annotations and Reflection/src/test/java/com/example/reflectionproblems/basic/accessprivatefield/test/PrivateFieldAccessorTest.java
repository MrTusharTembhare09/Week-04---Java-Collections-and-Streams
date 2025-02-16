package com.example.reflectionproblems.basic.accessprivatefield.test;

import com.example.reflectionproblems.basic.accessprivatefield.main.Person;
import com.example.reflectionproblems.basic.accessprivatefield.main.PrivateFieldAccessor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for PrivateFieldAccessor.
 */
class PrivateFieldAccessorTest {

    @Test
    void testPrivateFieldAccess() {
        Person person = new Person(40);

        // Verify initial age
        assertEquals(40, PrivateFieldAccessor.getPrivateAge(person));

        // Modify age
        PrivateFieldAccessor.setPrivateAge(person, 50);

        // Verify modified age
        assertEquals(50, PrivateFieldAccessor.getPrivateAge(person));
    }
}

