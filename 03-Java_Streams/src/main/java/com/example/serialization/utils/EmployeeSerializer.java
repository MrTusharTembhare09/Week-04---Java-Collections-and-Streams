package com.example.serialization.utils;

import java.io.*;
import java.util.List;

public class EmployeeSerializer {
    private static final String FILE_PATH = "src/main/resources/employees.txt";

    // Serializing employee list to file
    public static void saveEmployees(List<Employee> employees) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            oos.writeObject(employees);
            System.out.println("Saving employees to file successfully!");
        } catch (IOException e) {
            System.out.println("Error occurred while saving employees: " + e.getMessage());
        }
    }

    // Deserializing employee list from file
    @SuppressWarnings("unchecked")
    public static List<Employee> loadEmployees() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            return (List<Employee>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error occurred while loading employees: " + e.getMessage());
            return null;
        }
    }
}

