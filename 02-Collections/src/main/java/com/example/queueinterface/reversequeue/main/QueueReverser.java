package com.example.queueinterface.reversequeue.main;

import com.example.queueinterface.reversequeue.models.CustomQueue;
import com.example.queueinterface.reversequeue.utils.QueueUtil;

import java.util.Queue;

public class QueueReverser {
    public static void main(String[] args) {
        // Creating queue
        CustomQueue<Integer> customQueue = new CustomQueue<>();
        customQueue.enqueue(10);
        customQueue.enqueue(20);
        customQueue.enqueue(30);

        // Printing original queue
        System.out.println("Original Queue: " + customQueue);

        // Reversing the queue
        Queue<Integer> reversedQueue = QueueUtil.reverseQueue(customQueue.getQueue());

        // Printing reversed queue
        System.out.println("Reversed Queue: " + reversedQueue);
    }
}

