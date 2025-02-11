package com.example.problem3_multileveluniversitycoursemanagementsystem.courses;

import com.example.problem3_multileveluniversitycoursemanagementsystem.models.CourseType;

// Creating a generic course class with bounded type parameter
public class Course<T extends CourseType> {
    private String courseCode;
    private int credits;
    private T courseType;

    // Creating a constructor to initialize course details
    public Course(String courseCode, int credits, T courseType) {
        this.courseCode = courseCode;
        this.credits = credits;
        this.courseType = courseType;
    }

    // Getting the course code
    public String getCourseCode() {
        return courseCode;
    }


    // Getting the course credits
    public int getCredits() {
        return credits;
    }

    // Getting the course type
    public T getCourseType() {
        return courseType;
    }

    // Converting object to string representation
    @Override
    public String toString() {
        return "Course: " + courseCode + " | Credits: " + credits + " | Type: " + courseType;
    }
}

