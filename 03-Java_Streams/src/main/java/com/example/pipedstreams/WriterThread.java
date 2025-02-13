package com.example.pipedstreams;

import java.io.IOException;
import java.io.PipedOutputStream;

public class WriterThread extends Thread {
    private final PipedOutputStream outputStream;

    // Creating WriterThread and linking to PipedOutputStream
    public WriterThread(PipedOutputStream outputStream) {
        this.outputStream = outputStream;
    }

    @Override
    public void run() {
        try {
            String message = "Hello from WriterThread!";
            byte[] data = message.getBytes();

            // Writing data into PipedOutputStream
            outputStream.write(data);
            System.out.println("Writing data to pipe: " + message);

            // Closing stream after writing
            outputStream.close();
        } catch (IOException e) {
            System.out.println("Error occurred while writing: " + e.getMessage());
        }
    }
}

