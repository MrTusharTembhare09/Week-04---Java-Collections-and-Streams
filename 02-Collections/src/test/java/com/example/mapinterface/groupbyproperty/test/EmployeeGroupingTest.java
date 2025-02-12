package com.example.mapinterface.groupbyproperty.test;

import com.example.mapinterface.groupbyproperty.model.Employee;
import com.example.mapinterface.groupbyproperty.utils.EmployeeGrouping;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeGroupingTest {

    @Test
    void testGroupByDepartment() {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR")
        );

        Map<String, List<Employee>> expected = Map.of(
                "IT", List.of(new Employee("Bob", "IT")),
                "HR", List.of(new Employee("Alice", "HR"), new Employee("Carol", "HR"))
        );

        Map<String, List<Employee>> actual = EmployeeGrouping.groupByDepartment(employees);

        assertEquals(expected, actual);
    }
}

