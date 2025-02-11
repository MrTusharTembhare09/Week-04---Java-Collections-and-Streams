package com.example.problem3_multileveluniversitycoursemanagementsystem.models;

// Creating an AssignmentCourse class extending CourseType
public class AssignmentCourse extends CourseType {
    public AssignmentCourse(String name) {
        super(name + " (Assignment-Based)");
    }
}

