package com.example.pipedstreams;

import java.io.IOException;
import java.io.PipedInputStream;

public class ReaderThread extends Thread {
    private final PipedInputStream inputStream;

    // Creating ReaderThread and linking to PipedInputStream
    public ReaderThread(PipedInputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override
    public void run() {
        try {
            byte[] buffer = new byte[1024];
            int bytesRead = inputStream.read(buffer);

            // Converting bytes to string and displaying output
            String receivedMessage = new String(buffer, 0, bytesRead);
            System.out.println("Reading data from pipe: " + receivedMessage);

            // Closing stream after reading
            inputStream.close();
        } catch (IOException e) {
            System.out.println("Error occurred while reading: " + e.getMessage());
        }
    }
}

