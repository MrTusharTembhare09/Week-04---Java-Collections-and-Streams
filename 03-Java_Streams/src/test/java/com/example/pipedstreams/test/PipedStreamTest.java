package com.example.pipedstreams.test;

import org.junit.jupiter.api.Test;
import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class PipedStreamTest {
    @Test
    void testInterThreadCommunication() throws IOException {
        // Creating piped input and output streams
        PipedOutputStream outputStream = new PipedOutputStream();
        PipedInputStream inputStream = new PipedInputStream(outputStream);

        // Writing sample data into pipe
        String testMessage = "JUnit Test Message";
        outputStream.write(testMessage.getBytes());
        outputStream.close(); // Closing writer

        // Reading data from pipe
        byte[] buffer = new byte[1024];
        int bytesRead = inputStream.read(buffer);
        inputStream.close(); // Closing reader

        // Converting bytes to string
        String receivedMessage = new String(buffer, 0, bytesRead);

        // Validating received data
        assertEquals(testMessage, receivedMessage, "Data mismatch in piped streams!");
    }
}
