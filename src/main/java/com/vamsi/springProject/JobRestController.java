package com.vamsi.springProject;

import com.vamsi.springProject.model.JobPost;
import com.vamsi.springProject.service.JobService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobRestController{
    @Autowired
    private JobService service;
    @PostMapping("/addJob")
        public JobPost addJob(@Valid @RequestBody JobPost job){
        return service.add(job);
        }
    @GetMapping("/jobs/{jobId}")
    public JobPost jobs(@PathVariable int jobId)
    {
        return service.getJobById(jobId);
    }
    @PutMapping("/addJob")
    public void updateJob(@Valid @RequestBody JobPost jobPost)
    {
        service.updateJob(jobPost);
    }
 @GetMapping("/jobs")
 public List<JobPost> jobs()
 {
    return service.getAllJobs();
 }
 @DeleteMapping("/job/{jobId}")
    public String deleteJob(@PathVariable int jobId)
 {
     service.deleteJob(jobId);
     return "jobDeleted sucessfully";
 }

}