package com.vamsi.springProject.service;

import com.vamsi.springProject.model.JobPost;
import com.vamsi.springProject.repo.Jobrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class JobService {
    @Autowired
     private Jobrepo repo;
    public JobPost add(JobPost job) {
       return repo.save(job);
    }
    public List<JobPost> getAllJobs(){
        return repo.findAll();
    }

    public JobPost getJobById(int id) {
        return repo.getJobWithId(id);
    }

    public void updateJob(JobPost jobPost) {
        repo.updateJob(jobPost);
    }

    public void deleteJob(int jobId) {
        repo.deleteJob(jobId);
    }
}
