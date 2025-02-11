package com.example.problem3_multileveluniversitycoursemanagementsystem.utils;

import com.example.problem3_multileveluniversitycoursemanagementsystem.models.ExamCourse;
import com.example.problem3_multileveluniversitycoursemanagementsystem.models.AssignmentCourse;
import com.example.problem3_multileveluniversitycoursemanagementsystem.models.ResearchCourse;
import com.example.problem3_multileveluniversitycoursemanagementsystem.courses.Course;
import com.example.problem3_multileveluniversitycoursemanagementsystem.models.CourseType;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class CourseManagerTest {
    @Test
    void testDisplayCourses() {
        // Creating test course categories
        ExamCourse mathExam = new ExamCourse("Mathematics");
        AssignmentCourse historyAssignment = new AssignmentCourse("History");
        ResearchCourse physicsResearch = new ResearchCourse("Physics");

        // Creating test courses
        Course<ExamCourse> course1 = new Course<>("MATH101", 4, mathExam);
        Course<AssignmentCourse> course2 = new Course<>("HIST202", 3, historyAssignment);
        Course<ResearchCourse> course3 = new Course<>("PHYS303", 5, physicsResearch);

        // Adding to test list
        List<CourseType> testList = new ArrayList<>();
        testList.add(course1.getCourseType());
        testList.add(course2.getCourseType());
        testList.add(course3.getCourseType());

        // Ensuring the course list has correct number of elements
        assertEquals(3, testList.size());
    }
}


