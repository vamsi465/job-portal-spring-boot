package com.vamsi.springProject.repo;
import com.vamsi.springProject.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

import java.util.List;

@Repository
public interface Jobrepo extends JpaRepository<JobPost,Integer> {
    @Query("SELECT j FROM JobPost j WHERE j.location = :location")
    List<JobPost> findAllUsingLocation(@Param("location") String location);
}
