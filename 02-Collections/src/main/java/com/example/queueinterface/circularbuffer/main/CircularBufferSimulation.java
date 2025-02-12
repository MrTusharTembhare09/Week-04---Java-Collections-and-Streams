package com.example.queueinterface.circularbuffer.main;

import com.example.queueinterface.circularbuffer.utils.CircularBuffer;

public class CircularBufferSimulation {
    public static void main(String[] args) {
        CircularBuffer buffer = new CircularBuffer(3);

        // Adding elements to buffer
        buffer.add(1);
        buffer.add(2);
        buffer.add(3);
        System.out.println("Buffer after inserting 1, 2, 3: " + buffer); // Output: [1, 2, 3]

        // Overwriting the oldest element
        buffer.add(4);
        System.out.println("Buffer after inserting 4: " + buffer); // Output: [2, 3, 4]

        // Adding more elements to continue overwriting
        buffer.add(5);
        buffer.add(6);
        System.out.println("Buffer after inserting 5, 6: " + buffer); // Output: [4, 5, 6]
    }
}

