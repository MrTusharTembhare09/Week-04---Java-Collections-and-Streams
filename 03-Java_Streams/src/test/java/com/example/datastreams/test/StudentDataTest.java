package com.example.datastreams.test;

import com.example.datastreams.utils.StudentDataHandler;
import org.junit.jupiter.api.Test;
import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class StudentDataTest {
    private final String testFilePath = "src/main/resources/student_data.bin";

    @Test
    void testWriteAndReadStudentData() throws IOException {
        // Writing student details to binary file
        StudentDataHandler.writeStudentData(testFilePath, 102, "Bob Smith", 3.9);

        // Reading data from the file
        try (DataInputStream dis = new DataInputStream(new FileInputStream(testFilePath))) {
            int rollNumber = dis.readInt();
            String name = dis.readUTF();
            double gpa = dis.readDouble();

            // Validating retrieved data
            assertEquals(102, rollNumber, "Incorrect roll number!");
            assertEquals("Bob Smith", name, "Incorrect name!");
            assertEquals(3.9, gpa, 0.001, "Incorrect GPA!");
        }
    }
}

