package com.JobSeekers.Repositorys;

import com.JobSeekers.Models.JobModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepo extends JpaRepository<JobModel,Long> {
}
