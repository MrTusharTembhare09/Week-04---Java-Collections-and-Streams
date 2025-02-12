package com.example.mapinterface.groupbyproperty.utils;

import com.example.mapinterface.groupbyproperty.model.Employee;
import java.util.*;

// Creating EmployeeGrouping class to group employees by department
public class EmployeeGrouping {

    // Grouping employees by department
    public static Map<String, List<Employee>> groupByDepartment(List<Employee> employees) {
        Map<String, List<Employee>> groupedMap = new HashMap<>();

        for (Employee emp : employees) {
            groupedMap.computeIfAbsent(emp.getDepartment(), k -> new ArrayList<>()).add(emp);
        }

        return groupedMap;
    }
}

