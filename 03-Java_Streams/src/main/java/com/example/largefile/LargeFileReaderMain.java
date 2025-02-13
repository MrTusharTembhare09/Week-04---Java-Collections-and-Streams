package com.example.largefile;

public class LargeFileReaderMain {
    public static void main(String[] args) {
        // Specifying file path (Change this as needed)
        String filePath = "src/main/resources/largefile.txt";

        // Creating LargeFileReader instance
        LargeFileReader fileReader = new LargeFileReader(filePath);

        // Reading and printing lines containing "error"
        fileReader.readAndPrintErrorLines();
    }
}
