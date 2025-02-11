package com.example.problem5_aidrivenresumescreening.main;

import com.example.problem5_aidrivenresumescreening.models.*;
import com.example.problem5_aidrivenresumescreening.utils.ResumeProcessor;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creating instances of different job roles
        SoftwareEngineer candidate1 = new SoftwareEngineer("Alice");
        DataScientist candidate2 = new DataScientist("Bob");
        ProductEngineer candidate3 = new ProductEngineer("Charlie");

        // Creating a generic ResumeProcessor
        ResumeProcessor<JobRole> resumeProcessor = new ResumeProcessor<>();

        // Adding resumes to the processor
        resumeProcessor.addResume(candidate1);
        resumeProcessor.addResume(candidate2);
        resumeProcessor.addResume(candidate3);

        // Screening resumes dynamically
        ResumeProcessor.screenResumes(resumeProcessor.getResumes());
    }
}

