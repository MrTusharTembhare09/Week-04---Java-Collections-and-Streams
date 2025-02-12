package com.example.mapinterface.groupbyproperty.main;

import com.example.mapinterface.groupbyproperty.model.Employee;
import com.example.mapinterface.groupbyproperty.utils.EmployeeGrouping;

import java.util.*;

public class GroupByPropertyMain {
    public static void main(String[] args) {
        // Creating a list of employees
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR")
        );

        // Grouping employees by department
        Map<String, List<Employee>> groupedEmployees = EmployeeGrouping.groupByDepartment(employees);

        // Displaying the result
        groupedEmployees.forEach((department, empList) ->
                System.out.println(department + ": " + empList));
    }
}

