package com.example.serialization.test;

import com.example.serialization.utils.Employee;
import com.example.serialization.utils.EmployeeSerializer;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    private final String testFilePath = "src/main/resources/employees.txt";

    @Test
    void testSerializationAndDeserialization() {
        // Creating test employee list
        List<Employee> testEmployees = new ArrayList<>();
        testEmployees.add(new Employee(201, "David", "Marketing", 65000));

        // Saving test employees
        EmployeeSerializer.saveEmployees(testEmployees);

        // Checking if file exists
        File file = new File("src/main/resources/employees.txt");
        assertTrue(file.exists(), "File was not created!");

        // Loading employees
        List<Employee> loadedEmployees = EmployeeSerializer.loadEmployees();
        assertNotNull(loadedEmployees, "Deserialization failed!");
        assertEquals(1, loadedEmployees.size(), "Incorrect number of employees loaded!");
    }
}

