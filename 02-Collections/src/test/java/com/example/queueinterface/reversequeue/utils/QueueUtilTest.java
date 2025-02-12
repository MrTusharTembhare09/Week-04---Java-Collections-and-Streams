package com.example.queueinterface.reversequeue.utils;

import org.junit.jupiter.api.Test;
import java.util.LinkedList;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QueueUtilTest {

    @Test
    public void testReverseQueue() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        Queue<Integer> reversedQueue = QueueUtil.reverseQueue(queue);

        assertEquals(30, reversedQueue.poll());
        assertEquals(20, reversedQueue.poll());
        assertEquals(10, reversedQueue.poll());
    }
}

