package com.example.problem5_aidrivenresumescreening.utils;

import com.example.problem5_aidrivenresumescreening.models.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class ResumeProcessorTest {

    @Test
    void testAddResume() {
        ResumeProcessor<JobRole> resumeProcessor = new ResumeProcessor<>();
        SoftwareEngineer candidate = new SoftwareEngineer("Alice");

        // Adding resume to processor
        resumeProcessor.addResume(candidate);
        List<JobRole> resumes = resumeProcessor.getResumes();

        // Checking if the resume was added successfully
        assertEquals(1, resumes.size());
        assertEquals("Alice", resumes.get(0).getCandidateName());
        assertEquals("Software Engineer", resumes.get(0).getRoleType());
    }

    @Test
    void testScreenResumes() {
        ResumeProcessor<JobRole> resumeProcessor = new ResumeProcessor<>();
        DataScientist candidate = new DataScientist("Bob");

        // Adding resume and screening
        resumeProcessor.addResume(candidate);
        assertDoesNotThrow(() -> ResumeProcessor.screenResumes(resumeProcessor.getResumes()));
    }
}

