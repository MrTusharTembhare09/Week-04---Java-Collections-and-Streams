package com.example.problem3_multileveluniversitycoursemanagementsystem.models;

// Creating an ExamCourse class extending CourseType
public class ExamCourse extends CourseType {
    public ExamCourse(String name) {
        super(name + " (Exam-Based)");
    }
}

