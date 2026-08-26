package com.vamsi.springProject;

import com.vamsi.springProject.model.JobPost;
import com.vamsi.springProject.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobRestController{
    @Autowired
    private JobService service;
    @PostMapping("/addJob")
        public JobPost addJob(@RequestBody JobPost job){
        return service.add(job);
        }
    @GetMapping("/jobs/{jobId}")
    public JobPost jobs(@PathVariable int jobId)
    {
        return service.getJobById(jobId);
    }
 @GetMapping("/jobs")
 public List<JobPost> jobs()
 {
    return service.getAllJobs();
 }

}