package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Feedback;
import com.example.demo.entity.Student;
import com.example.demo.service.FeedbackService;
import com.example.demo.service.StudentService;

@Controller
public class FeedbackController {

	@Autowired (required=false)
	private FeedbackService feedbackservice;
	
	
@Autowired StudentService studentservice;
	
	
	@GetMapping("/feedback")
	public String Feedbacklist(Model model) {
		model.addAttribute("feedback",feedbackservice.getAllFeedback());
		return "feedback_list";
	}
	
	@GetMapping("/feedback/showall")
	public List<Feedback> getAllFeedback(){
			return feedbackservice.getAllFeedback();
	}

	
	@GetMapping("/feedback/new/{candidate_Id}")
	public String createFeedbackForm(Model model,@PathVariable int candidate_Id) {
		Student student = studentservice.getStudentById(candidate_Id);
		Feedback feedback = new Feedback();
		feedback.setFEEDBACK_CANDIDATE_ID(candidate_Id);
		feedback.setS1(student);
		model.addAttribute("feedback",feedback);
		return "feedback";
	}

	@PostMapping("/feedback")
public String SaveFeedback(@ModelAttribute("feedback")Feedback feedback){
		feedbackservice.addfeedback(feedback);
		return "redirect:/students/detail/"+feedback.getFEEDBACK_CANDIDATE_ID();
}
	
/*
 * @GetMapping("/feedback/detail/{feedback_Id}") public String
 * getFeedbackById(@PathVariable int feedback_Id, Model model) { Feedback
 * feedback = feedbackservice.getFeedbackById(feedback_Id);
 * model.addAttribute("feedback", feedback); return "student_detail"; }
 */
	
	
}
