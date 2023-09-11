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
@Table(name="User")
public class AuthModel {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private  String fullName;
    private  String companyName;
    private  String emailId;
    private  String password;
}
