package com.example.problem3_multileveluniversitycoursemanagementsystem.utils;

import com.example.problem3_multileveluniversitycoursemanagementsystem.models.CourseType;
import com.example.problem3_multileveluniversitycoursemanagementsystem.courses.Course;
import java.util.List;

// Creating a utility class for course operations
public class CourseManager {
    // Displaying all courses using wildcard
    public static void displayCourses(List<? extends CourseType> courses) {
        System.out.println("\n---- Available Courses ----");
        for (CourseType course : courses) {
            System.out.println(course);
        }
    }
}

