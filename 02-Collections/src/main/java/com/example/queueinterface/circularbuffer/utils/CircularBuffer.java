package com.example.queueinterface.circularbuffer.utils;

import java.util.Arrays;

public class CircularBuffer {
    private int[] buffer;
    private int head;
    private int tail;
    private int size;
    private int capacity;

    // Creating circular buffer with fixed size
    public CircularBuffer(int capacity) {
        this.capacity = capacity;
        this.buffer = new int[capacity];
        this.head = 0;
        this.tail = 0;
        this.size = 0;
    }

    // Adding element to buffer (overwrites if full)
    public void add(int value) {
        buffer[tail] = value;
        tail = (tail + 1) % capacity;
        if (size < capacity) {
            size++;
        } else {
            head = (head + 1) % capacity; // Overwrite oldest element
        }
    }

    // Retrieving elements in buffer order
    public int[] getBuffer() {
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = buffer[(head + i) % capacity];
        }
        return result;
    }

    // Checking if buffer is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Checking if buffer is full
    public boolean isFull() {
        return size == capacity;
    }

    // Clearing buffer
    public void clear() {
        head = 0;
        tail = 0;
        size = 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(getBuffer());
    }
}

