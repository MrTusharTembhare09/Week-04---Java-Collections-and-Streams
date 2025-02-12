package com.example.queueinterface.stackusingqueues.utils;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    // Creating constructor
    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    // Pushing element onto stack
    public void push(int x) {
        queue1.offer(x);
    }

    // Popping top element from stack
    public int pop() {
        if (queue1.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        // Move elements except last from queue1 to queue2
        while (queue1.size() > 1) {
            queue2.offer(queue1.poll());
        }
        int topElement = queue1.poll();

        // Swap queues
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return topElement;
    }

    // Getting top element of stack
    public int top() {
        if (queue1.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        // Move elements except last from queue1 to queue2
        while (queue1.size() > 1) {
            queue2.offer(queue1.poll());
        }
        int topElement = queue1.poll();
        queue2.offer(topElement);

        // Swap queues
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return topElement;
    }

    // Checking if stack is empty
    public boolean isEmpty() {
        return queue1.isEmpty();
    }
}

