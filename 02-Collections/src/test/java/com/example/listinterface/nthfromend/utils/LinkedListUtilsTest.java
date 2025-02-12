package com.example.listinterface.nthfromend.utils;

import org.junit.jupiter.api.Test;
import java.util.LinkedList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class LinkedListUtilsTest {

    @Test
    void testFindNthFromEnd_ValidCase() {
        // Creating a test linked list
        LinkedList<String> list = new LinkedList<>(List.of("A", "B", "C", "D", "E"));

        // Validating the output
        assertEquals("D", LinkedListUtils.findNthFromEnd(list, 2));
    }

    @Test
    void testFindNthFromEnd_NGreaterThanSize() {
        // Creating a test linked list
        LinkedList<String> list = new LinkedList<>(List.of("A", "B", "C"));

        // Validating exception when N is too large
        assertThrows(IllegalArgumentException.class, () -> LinkedListUtils.findNthFromEnd(list, 0));
    }

    @Test
    void testFindNthFromEnd_SingleElement() {
        // Creating a test linked list with one element
        LinkedList<String> list = new LinkedList<>(List.of("A"));

        // Validating the single element case
        assertEquals("A", LinkedListUtils.findNthFromEnd(list, 1));
    }
}

