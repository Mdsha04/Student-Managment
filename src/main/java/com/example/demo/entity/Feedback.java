package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="feedback")
public class Feedback {
	
	@Id
	@GeneratedValue(generator="feedback_gen",strategy=GenerationType.AUTO)
	@SequenceGenerator(
		    name = "feedback_gen",
		    sequenceName = "feedback_seq",
		    initialValue = 1,          
		    allocationSize = 1          
		)
	private int feedback_Id;
	private int FEEDBACK_EVALUATOR_ID;
	private int FEEDBACK_CANDIDATE_ID;
	private String FEEDBACK_SCREENING_LEVEL;
	private String feedback_Status;
	private String feedback_Comment;
	 @ManyToOne
	 @JoinColumn(name = "student_id")
	private Student s1;
//	private User u1;
	
	@Override
	public String toString() {
		return "Feedback [feedback_Id=" + feedback_Id + ", FEEDBACK_EVALUATOR_ID=" + FEEDBACK_EVALUATOR_ID
				+ ", FEEDBACK_CANDIDATE_ID=" + FEEDBACK_CANDIDATE_ID + ", FEEDBACK_SCREENING_LEVEL="
				+ FEEDBACK_SCREENING_LEVEL + ", feedback_Status=" + feedback_Status + ", feedback_Comment="
				+ feedback_Comment + "]";
	}

	public int getFeedback_Id() {
		return feedback_Id;
	}

	public void setFeedback_Id(int feedback_Id) {
		this.feedback_Id = feedback_Id;
	}

	public int getFEEDBACK_EVALUATOR_ID() {
		return FEEDBACK_EVALUATOR_ID;
	}

	public void setFEEDBACK_EVALUATOR_ID(int fEEDBACK_EVALUATOR_ID) {
		FEEDBACK_EVALUATOR_ID = fEEDBACK_EVALUATOR_ID;
	}

	public int getFEEDBACK_CANDIDATE_ID() {
		return FEEDBACK_CANDIDATE_ID;
	}

	public void setFEEDBACK_CANDIDATE_ID(int fEEDBACK_CANDIDATE_ID) {
		FEEDBACK_CANDIDATE_ID = fEEDBACK_CANDIDATE_ID;
	}

	public String getFEEDBACK_SCREENING_LEVEL() {
		return FEEDBACK_SCREENING_LEVEL;
	}

	public void setFEEDBACK_SCREENING_LEVEL(String fEEDBACK_SCREENING_LEVEL) {
		FEEDBACK_SCREENING_LEVEL = fEEDBACK_SCREENING_LEVEL;
	}

	public String getFeedback_Status() {
		return feedback_Status;
	}

	public void setFeedback_Status(String feedback_Status) {
		this.feedback_Status = feedback_Status;
	}

	public String getFeedback_Comment() {
		return feedback_Comment;
	}

	public void setFeedback_Comment(String feedback_Comment) {
		this.feedback_Comment = feedback_Comment;
	}

//	public User getU1() {
//		return u1;
//	}

//	public void setU1(User u1) {
//		this.u1 = u1;
//	}

	public Student getS1() {
		return s1;
	}

	public void setS1(Student s1) {
		this.s1 = s1;
	}

	public Feedback() {
		super();
	}

	public Feedback(int feedback_Id, int fEEDBACK_EVALUATOR_ID, int fEEDBACK_CANDIDATE_ID,
			String fEEDBACK_SCREENING_LEVEL, String feedback_Status, String feedback_Comment, User u1, Student s1) {
		super();
		this.feedback_Id = feedback_Id;
		FEEDBACK_EVALUATOR_ID = fEEDBACK_EVALUATOR_ID;
		FEEDBACK_CANDIDATE_ID = fEEDBACK_CANDIDATE_ID;
		FEEDBACK_SCREENING_LEVEL = fEEDBACK_SCREENING_LEVEL;
		this.feedback_Status = feedback_Status;
		this.feedback_Comment = feedback_Comment;
//		this.u1 = u1;
		this.s1 = s1;
	}

	
	
}
