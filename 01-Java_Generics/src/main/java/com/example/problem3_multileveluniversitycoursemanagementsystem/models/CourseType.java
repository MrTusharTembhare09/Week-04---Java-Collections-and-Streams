package com.example.problem3_multileveluniversitycoursemanagementsystem.models;

// Creating an abstract class for course types
public abstract class CourseType {
    private String courseName;

    // Creating a constructor to initialize course name
    public CourseType(String courseName) {
        this.courseName = courseName;
    }

    // Getting the course name
    public String getCourseName() {
        return courseName;
    }

    // Converting object to string representation
    @Override
    public String toString() {
        return courseName;
    }
}

