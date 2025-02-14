package com.example.junitproblems.basic.listmanager.test;

import com.example.junitproblems.basic.listmanager.ListManager;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

// Creating JUnit test class for ListManager
public class ListManagerTest {

    // Creating an instance of ListManager for testing
    private final ListManager listManager = new ListManager();

    @Test
    void testAddElement() {
        List<Integer> list = new ArrayList<>();
        listManager.addElement(list, 5);
        assertEquals(1, list.size());
        assertTrue(list.contains(5));
    }

    @Test
    void testRemoveElement() {
        List<Integer> list = new ArrayList<>();
        listManager.addElement(list, 10);
        assertTrue(listManager.removeElement(list, 10));
        assertFalse(list.contains(10));
    }

    @Test
    void testGetSize() {
        List<Integer> list = new ArrayList<>();
        listManager.addElement(list, 15);
        listManager.addElement(list, 20);
        assertEquals(2, listManager.getSize(list));
    }

    @Test
    void testRemoveNonExistentElement() {
        List<Integer> list = new ArrayList<>();
        listManager.addElement(list, 25);
        assertFalse(listManager.removeElement(list, 30));
    }

    @Test
    void testNullList() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> listManager.addElement(null, 5));
        assertEquals("List cannot be null", exception.getMessage());
    }
}
