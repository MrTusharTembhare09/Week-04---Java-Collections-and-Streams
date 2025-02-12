package com.example.queueinterface.stackusingqueues.main;

import com.example.queueinterface.stackusingqueues.utils.MyStack;

public class StackUsingQueues {
    public static void main(String[] args) {
        MyStack stack = new MyStack();

        // Pushing elements onto stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Displaying top element
        System.out.println("Top element: " + stack.top()); // Output: 3

        // Popping top element
        System.out.println("Popped element: " + stack.pop()); // Output: 3

        // Displaying top element after pop
        System.out.println("Top element after pop: " + stack.top()); // Output: 2
    }
}

