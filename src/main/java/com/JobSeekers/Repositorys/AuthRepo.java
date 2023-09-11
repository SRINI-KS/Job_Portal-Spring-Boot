package com.JobSeekers.Repositorys;

import com.JobSeekers.Models.AuthModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AuthRepo extends JpaRepository<AuthModel, UUID> {
    String findByEmailId(String emailId);

    AuthModel findByEmailIdAndPassword(String tempEmail, String tempPassword);
}
