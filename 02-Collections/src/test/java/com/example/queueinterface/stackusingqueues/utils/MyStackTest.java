package com.example.queueinterface.stackusingqueues.utils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyStackTest {

    @Test
    public void testStackOperations() {
        MyStack stack = new MyStack();

        // Pushing elements
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Checking top element
        assertEquals(3, stack.top());

        // Popping element
        assertEquals(3, stack.pop());

        // Checking top element after pop
        assertEquals(2, stack.top());

        // Checking empty condition
        stack.pop();
        stack.pop();
        assertTrue(stack.isEmpty());
    }
}

