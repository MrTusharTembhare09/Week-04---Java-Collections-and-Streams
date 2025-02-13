package com.example.serialization.main;

import com.example.serialization.utils.Employee;
import com.example.serialization.utils.EmployeeSerializer;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMain {
    public static void main(String[] args) {
        // Creating employee list
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Alice", "HR", 50000));
        employees.add(new Employee(102, "Bob", "IT", 70000));
        employees.add(new Employee(103, "Charlie", "Finance", 60000));

        // Saving employees
        EmployeeSerializer.saveEmployees(employees);

        // Loading employees
        List<Employee> loadedEmployees = EmployeeSerializer.loadEmployees();
        if (loadedEmployees != null) {
            System.out.println("Retrieved Employees from file:");
            loadedEmployees.forEach(System.out::println);
        }
    }
}

