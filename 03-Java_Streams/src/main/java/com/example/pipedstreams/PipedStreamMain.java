package com.example.pipedstreams;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedStreamMain {
    public static void main(String[] args) {
        try {
            // Creating piped input and output streams
            PipedOutputStream outputStream = new PipedOutputStream();
            PipedInputStream inputStream = new PipedInputStream(outputStream);

            // Creating writer and reader threads
            WriterThread writerThread = new WriterThread(outputStream);
            ReaderThread readerThread = new ReaderThread(inputStream);

            // Starting threads
            writerThread.start();
            readerThread.start();

            // Waiting for threads to finish
            writerThread.join();
            readerThread.join();
        } catch (IOException | InterruptedException e) {
            System.out.println("Error in inter-thread communication: " + e.getMessage());
        }
    }
}

