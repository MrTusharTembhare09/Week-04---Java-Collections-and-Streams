package com.example.queueinterface.generatebinarynumbers.models;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryQueue {
    private Queue<String> queue;

    // Creating constructor
    public BinaryQueue() {
        this.queue = new LinkedList<>();
    }

    // Adding element to the queue
    public void enqueue(String element) {
        queue.add(element);
    }

    // Removing and returning the front element
    public String dequeue() {
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

    // Getting the underlying queue
    public Queue<String> getQueue() {
        return queue;
    }
}

