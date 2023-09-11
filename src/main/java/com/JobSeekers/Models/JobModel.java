package com.JobSeekers.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="JobPost")
public class JobModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
private UUID userId;
    private String jobTitle;
    private String jobDescription;

    private String jobCategory;

    private String jobType;

    private String jobPostDate;
    private String salaryType;
    private String minSalary;
    private String maxSalary;
    private String skills;
    private String qualifications;
    private String experience;
    private String companyName;
    private String companyContactPerson;

    private String contactEmail;

    private String contactNumber;

    private String companyAddress;
    private String country;
    private String state;
    private String pincode;









}
