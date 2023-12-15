package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Feedback;
import com.example.demo.repository.FeedbackRepository;
import com.example.demo.service.FeedbackService;
@Service
public class FeedbackServiceImpl implements FeedbackService {

	@Autowired FeedbackRepository feedbackrepository;

	@Override
	public List<Feedback> getAllFeedback() {
		return feedbackrepository.findAll();
	}
	
	@Override
	public Feedback addfeedback(Feedback feedback) {
		return feedbackrepository.save(feedback);
	}

	@Override
	public Feedback getFeedbackById(int feedback_Id) {
		return feedbackrepository.findById(feedback_Id).get();
		}

	

	
}
