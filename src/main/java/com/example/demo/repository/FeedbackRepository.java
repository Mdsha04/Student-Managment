package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback,Integer> {
	
//    @Query("SELECT f FROM feedback f INNER JOIN f.students s")
//    List<Feedback> getFeedbackById();
}
