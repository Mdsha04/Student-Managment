package com.example.demo.service;



import java.util.List;

import com.example.demo.entity.Feedback;
import com.example.demo.entity.Student;

public interface FeedbackService {

	Feedback addfeedback(Feedback feedback);
	
	Feedback getFeedbackById(int feedback_Id);
	
	List<Feedback>getAllFeedback();
}
