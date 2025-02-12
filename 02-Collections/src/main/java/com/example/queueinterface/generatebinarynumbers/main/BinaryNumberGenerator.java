package com.example.queueinterface.generatebinarynumbers.main;

import com.example.queueinterface.generatebinarynumbers.utils.BinaryUtil;
import java.util.List;

public class BinaryNumberGenerator {
    public static void main(String[] args) {
        int n = 5; // Number of binary numbers to generate

        // Generating binary numbers
        List<String> binaryNumbers = BinaryUtil.generateBinaryNumbers(n);

        // Printing generated binary numbers
        System.out.println("First " + n + " Binary Numbers: " + binaryNumbers);
    }
}

