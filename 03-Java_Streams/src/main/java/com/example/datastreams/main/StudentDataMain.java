package com.example.datastreams.main;

import com.example.datastreams.utils.StudentDataHandler;

public class StudentDataMain {
    public static void main(String[] args) {
        // Defining file path for binary file
        String filePath = "src/main/resources/student_data.bin";

        // Writing student details to a binary file
        StudentDataHandler.writeStudentData(filePath, 101, "Alice Johnson", 3.8);

        // Reading and displaying student details from the binary file
        StudentDataHandler.readStudentData(filePath);
    }
}

