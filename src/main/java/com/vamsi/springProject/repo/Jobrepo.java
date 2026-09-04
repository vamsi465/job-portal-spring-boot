package com.vamsi.springProject.repo;
import com.vamsi.springProject.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Jobrepo extends JpaRepository<JobPost,Integer> {

}
