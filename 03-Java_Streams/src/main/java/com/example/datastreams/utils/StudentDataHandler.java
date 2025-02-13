package com.example.datastreams.utils;

import java.io.*;

public class StudentDataHandler {
    // Storing student details in a binary file
    public static void writeStudentData(String filePath, int rollNumber, String name, double gpa) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filePath))) {
            dos.writeInt(rollNumber); // Writing roll number
            dos.writeUTF(name); // Writing student name
            dos.writeDouble(gpa); // Writing GPA
            System.out.println("Writing student data successfully into: " + filePath);
        } catch (IOException e) {
            System.out.println("Error occurred while writing student data: " + e.getMessage());
        }
    }

    // Retrieving student details from a binary file
    public static void readStudentData(String filePath) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filePath))) {
            int rollNumber = dis.readInt(); // Reading roll number
            String name = dis.readUTF(); // Reading student name
            double gpa = dis.readDouble(); // Reading GPA

            // Displaying student details
            System.out.println("Student Details Retrieved:");
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("GPA: " + gpa);
        } catch (IOException e) {
            System.out.println("Error occurred while reading student data: " + e.getMessage());
        }
    }
}

