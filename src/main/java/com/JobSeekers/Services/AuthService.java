package com.JobSeekers.Services;

import com.JobSeekers.Models.AuthModel;
import com.JobSeekers.Repositorys.AuthRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    @Autowired
    AuthRepo authRepo;
    public AuthModel register(AuthModel reg) {
        return this.authRepo.save(reg);

    }
}
