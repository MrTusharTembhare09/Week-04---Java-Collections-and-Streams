package com.example.queueinterface.circularbuffer.utils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CircularBufferTest {

    @Test
    public void testCircularBufferOperations() {
        CircularBuffer buffer = new CircularBuffer(3);

        // Initially empty
        assertTrue(buffer.isEmpty());

        // Adding elements
        buffer.add(1);
        buffer.add(2);
        buffer.add(3);
        assertArrayEquals(new int[]{1, 2, 3}, buffer.getBuffer());

        // Overwriting oldest element
        buffer.add(4);
        assertArrayEquals(new int[]{2, 3, 4}, buffer.getBuffer());

        // Overwriting further
        buffer.add(5);
        buffer.add(6);
        assertArrayEquals(new int[]{4, 5, 6}, buffer.getBuffer());

        // Checking full condition
        assertTrue(buffer.isFull());

        // Clearing buffer
        buffer.clear();
        assertTrue(buffer.isEmpty());
    }
}

