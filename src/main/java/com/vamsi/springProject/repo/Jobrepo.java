package com.vamsi.springProject.repo;
import com.vamsi.springProject.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import java.util.List;

@Repository
public interface Jobrepo extends JpaRepository<JobPost,Integer> {
    List<JobPost> findByCompany(String company);
}
