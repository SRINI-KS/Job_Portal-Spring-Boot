package com.JobSeekers.Services;

import com.JobSeekers.Models.JobModel;
import com.JobSeekers.Repositorys.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobPostService {
    @Autowired
    JobRepo jobRepo;
    public JobModel postNewJob(JobModel jobModel) {
        return this.jobRepo.save(jobModel);
    }

    public List<JobModel> getJobList(){
        return this.jobRepo.findAll();
    }

    public Optional<JobModel> getJobListById(Long id) {
        Optional<JobModel> data=  this.jobRepo.findById(id);
        System.out.println(data);
        return data;


    }
}
