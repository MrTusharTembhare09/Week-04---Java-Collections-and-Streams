package com.example.serialization.utils;

import java.io.Serializable;

public class Employee implements Serializable {
    private static final long serialVersionUID = 1L; // Ensuring compatibility during deserialization

    private int id;
    private String name;
    private String department;
    private double salary;

    // Creating constructor
    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Generating toString() for easy display
    @Override
    public String toString() {
        return "Employee { " +
                "ID=" + id +
                ", Name='" + name + '\'' +
                ", Department='" + department + '\'' +
                ", Salary=" + salary +
                " }";
    }
}
