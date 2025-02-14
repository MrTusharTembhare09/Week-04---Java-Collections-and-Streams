package com.example.trywithresources.main;

import java.util.Scanner;

public class FileReaderMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking user for file path
        System.out.print("Enter the file path: ");
        String filePath = scanner.nextLine();

        // Reading the first line using FileReaderUtil
        String result = FileReaderUtil.readFirstLine(filePath);

        // Displaying the result
        System.out.println(result);

        // Closing scanner resource
        scanner.close();
    }
}
