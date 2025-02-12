package com.example.queueinterface.reversequeue.models;

import java.util.LinkedList;
import java.util.Queue;

public class CustomQueue<T> {
    private Queue<T> queue;

    // Creating constructor
    public CustomQueue() {
        this.queue = new LinkedList<>();
    }

    // Adding element to the queue
    public void enqueue(T element) {
        queue.add(element);
    }

    // Removing and returning the front element
    public T dequeue() {
        return queue.poll();
    }

    // Checking if the queue is empty
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // Getting queue size
    public int size() {
        return queue.size();
    }

    // Returning queue representation
    @Override
    public String toString() {
        return queue.toString();
    }

    // Getting the underlying queue
    public Queue<T> getQueue() {
        return queue;
    }
}

