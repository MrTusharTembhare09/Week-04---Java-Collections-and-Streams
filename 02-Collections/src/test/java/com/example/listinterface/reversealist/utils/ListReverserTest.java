package com.example.listinterface.reversealist.utils;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class ListReverserTest {

    @Test
    void testReverseArrayList() {
        // Creating an ArrayList
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        // Reversing the list
        ListReverser.reverseList(list);

        // Verifying the result
        assertEquals(Arrays.asList(5, 4, 3, 2, 1), list);
    }

    @Test
    void testReverseLinkedList() {
        // Creating a LinkedList
        List<Integer> list = new LinkedList<>(Arrays.asList(10, 20, 30, 40));

        // Reversing the list
        ListReverser.reverseList(list);

        // Verifying the result
        assertEquals(Arrays.asList(40, 30, 20, 10), list);
    }

    @Test
    void testReverseEmptyList() {
        // Creating an empty list
        List<Integer> list = new ArrayList<>();

        // Reversing the list
        ListReverser.reverseList(list);

        // Verifying the result
        assertTrue(list.isEmpty());
    }
}
