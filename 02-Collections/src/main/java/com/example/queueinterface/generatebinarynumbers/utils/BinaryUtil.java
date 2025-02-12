package com.example.queueinterface.generatebinarynumbers.utils;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryUtil {
    // Generating first N binary numbers using a queue
    public static List<String> generateBinaryNumbers(int n) {
        List<String> binaryList = new LinkedList<>();
        Queue<String> queue = new LinkedList<>();
        queue.add("1");

        // Generating N binary numbers
        for (int i = 0; i < n; i++) {
            String binary = queue.poll();
            binaryList.add(binary);

            // Generating next two binary numbers
            queue.add(binary + "0");
            queue.add(binary + "1");
        }
        return binaryList;
    }
}

