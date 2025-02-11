package com.example.problem3_multileveluniversitycoursemanagementsystem.main;

import com.example.problem3_multileveluniversitycoursemanagementsystem.models.*;
import com.example.problem3_multileveluniversitycoursemanagementsystem.courses.*;
import com.example.problem3_multileveluniversitycoursemanagementsystem.utils.CourseManager;
import java.util.ArrayList;
import java.util.List;

public class UniversitySystem {
    public static void main(String[] args) {
        // Creating different course categories
        ExamCourse mathExam = new ExamCourse("Mathematics");
        AssignmentCourse historyAssignment = new AssignmentCourse("History");
        ResearchCourse physicsResearch = new ResearchCourse("Physics");

        // Creating courses
        Course<ExamCourse> course1 = new Course<>("MATH101", 4, mathExam);
        Course<AssignmentCourse> course2 = new Course<>("HIST202", 3, historyAssignment);
        Course<ResearchCourse> course3 = new Course<>("PHYS303", 5, physicsResearch);

        // Storing courses in a list
        List<CourseType> courseList = new ArrayList<>();
        courseList.add(course1.getCourseType());
        courseList.add(course2.getCourseType());
        courseList.add(course3.getCourseType());

        // Displaying all courses
        CourseManager.displayCourses(courseList);
    }
}
