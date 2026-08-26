package com.vamsi.springProject.repo;

import com.vamsi.springProject.exception.JobNotFoundById;
import com.vamsi.springProject.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class Jobrepo {
    private List<JobPost>jobs=new ArrayList<>();
    public JobPost save(JobPost jobPost) {
            jobs.add(jobPost);
        return jobPost;
    }
    public List<JobPost> findAll(){
        return jobs;
    }

    public JobPost getJobWithId(int id) {
            for (JobPost job : jobs) {
                if (job.getJobId() == id) {
                    return job;
                }
            }
            throw new JobNotFoundById("job not found by id"+id+"is not there");
        }
    }
