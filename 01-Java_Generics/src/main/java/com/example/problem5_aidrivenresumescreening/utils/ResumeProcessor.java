package com.example.problem5_aidrivenresumescreening.utils;

import com.example.problem5_aidrivenresumescreening.models.JobRole;
import java.util.ArrayList;
import java.util.List;

// Creating ResumeProcessor class to store and process resumes
public class ResumeProcessor<T extends JobRole> {
    private final List<T> resumes = new ArrayList<>();

    // Adding a resume to the processor
    public void addResume(T resume) {
        resumes.add(resume);
    }

    // Retrieving all stored resumes
    public List<T> getResumes() {
        return resumes;
    }

    // Screening multiple resumes dynamically
    public static void screenResumes(List<? extends JobRole> jobRoles) {
        System.out.println("Screening Resumes:");
        for (JobRole role : jobRoles) {
            System.out.println(role.getCandidateName() + " applied for " + role.getRoleType());
        }
    }
}

