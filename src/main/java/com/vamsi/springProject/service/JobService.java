package com.vamsi.springProject.service;

import com.vamsi.springProject.model.JobPost;
import com.vamsi.springProject.repo.Jobrepo;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    private Jobrepo repo;
    public JobPost add(@Valid JobPost job) {
        return repo.save(job);
    }

    public JobPost getJobById(int jobId) {
        return repo.findById(jobId)
                .orElseThrow(() -> new RuntimeException("job not found"));
    }

    public @Valid void updateJob(@Valid JobPost jobPost) {
        repo.save(jobPost);
    }

    public List<JobPost> getAllJobs() {
        return repo.findAll();
    }

    public void deleteJob(JobPost jobId) {
        repo.delete(jobId);
    }
}
