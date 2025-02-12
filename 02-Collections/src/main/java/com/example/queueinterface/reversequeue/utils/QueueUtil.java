package com.example.queueinterface.reversequeue.utils;

import java.util.Queue;
import java.util.Stack;

public class QueueUtil {
    // Reversing a queue using only queue operations
    public static <T> Queue<T> reverseQueue(Queue<T> queue) {
        Stack<T> stack = new Stack<>();

        // Removing elements from queue and pushing onto stack
        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }

        // Popping elements from stack and adding back to queue
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        return queue;
    }
}

