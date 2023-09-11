package com.JobSeekers.Controllers;

import com.JobSeekers.Models.JobModel;
import com.JobSeekers.Services.JobPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class JobPost {

    @Autowired
    JobPostService jobPostService;
    @PostMapping("/postJob")
    public JobModel postJob(@RequestBody JobModel jobModel) {
        return jobPostService.postNewJob(jobModel);
    }

@GetMapping("/getJobList")
    public List<JobModel> getJobList(){
        return this.jobPostService.getJobList();
}


    @GetMapping("/getJobById/{id}")
    public Optional<JobModel> getJobListById(@PathVariable Long id){
        return this.jobPostService.getJobListById(id);
    }

}

