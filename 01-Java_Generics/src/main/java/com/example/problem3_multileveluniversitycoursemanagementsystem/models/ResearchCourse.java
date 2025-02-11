package com.example.problem3_multileveluniversitycoursemanagementsystem.models;

// Creating a ResearchCourse class extending CourseType
public class ResearchCourse extends CourseType {
    public ResearchCourse(String name) {
        super(name + " (Research-Based)");
    }
}

