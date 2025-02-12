package com.example.insurancepolicymanagement.models;

import java.time.LocalDate;
import java.util.Objects;

public class InsurancePolicy implements Comparable<InsurancePolicy> {
    private String policyNumber;
    private String policyholderName;
    private LocalDate expiryDate;
    private String coverageType;
    private double premiumAmount;

    // Creating constructor
    public InsurancePolicy(String policyNumber, String policyholderName, LocalDate expiryDate,
                           String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    // Generating Getters
    public String getPolicyNumber() {
        return policyNumber;
    }

    public String getPolicyholderName() {
        return policyholderName;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public String getCoverageType() {
        return coverageType;
    }

    public double getPremiumAmount() {
        return premiumAmount;
    }

    // Overriding equals() and hashCode() to ensure uniqueness in sets
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        InsurancePolicy that = (InsurancePolicy) obj;
        return Objects.equals(policyNumber, that.policyNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyNumber);
    }

    // Overriding compareTo for sorting by expiry date in TreeSet
    @Override
    public int compareTo(InsurancePolicy other) {
        return this.expiryDate.compareTo(other.expiryDate);
    }

    // Overriding toString for displaying policy details
    @Override
    public String toString() {
        return "PolicyNumber: " + policyNumber + ", Holder: " + policyholderName +
                ", Expiry: " + expiryDate + ", Type: " + coverageType +
                ", Premium: " + premiumAmount;
    }
}

