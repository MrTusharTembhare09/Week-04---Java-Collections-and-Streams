package com.example.annotationsproblems.customannotations.bigginerlevel.todo;

import com.example.annotationsproblems.customannotations.bigginerlevel.todo.TodoProcessor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TodoProcessorTest {

    @Test
    void testTodoProcessing() {
        // Redirecting console output to capture the printed statement
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Processing @Todo annotations
        TodoProcessor.processTodos();

        // Restoring system output
        System.setOut(System.out);

        // Checking if the correct output is printed
        String expectedOutput = "Pending Tasks in TaskManager class:\n" +
                "- Task: Implement user authentication\n" +
                "  Assigned To: Alice\n" +
                "  Priority: HIGH\n" +
                "- Task: Optimize database queries\n" +
                "  Assigned To: Bob\n" +
                "  Priority: MEDIUM";

        assertTrue(outputStream.toString().contains(expectedOutput.trim()));
    }
}

