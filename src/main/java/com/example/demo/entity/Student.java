package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
@Entity
@Table(name="students")
public class Student {
	@Id
	@GeneratedValue(generator="students_gen",strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(
		    name = "students_gen",   
		    sequenceName = "students_seq",  
		    initialValue = 1,           
		    allocationSize = 1         
		)
@Column(name="student_id")
	private int student_id;
	private String studentName;
	private long student_phone;
	private String student_email;
	private String student_resume;
	private String student_comment;
	
		
	public int getStudent_id() {
		return student_id;
	}


	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}





	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public long getStudent_phone() {
		return student_phone;
	}


	public void setStudent_phone(long student_phone) {
		this.student_phone = student_phone;
	}


	public String getStudent_email() {
		return student_email;
	}


	public void setStudent_email(String student_email) {
		this.student_email = student_email;
	}


	public String getStudent_resume() {
		return student_resume;
	}


	public void setStudent_resume(String student_resume) {
		this.student_resume = student_resume;
	}


	public String getStudent_comment() {
		return student_comment;
	}


	public void setStudent_comment(String student_comment) {
		this.student_comment = student_comment;
	}


	public Student() {
	}
	
	
	public Student(String studentName, long student_phone, String student_email, String student_resume,
			String student_comment) {
		super();
	
		this.studentName = studentName;
		this.student_phone = student_phone;
		this.student_email = student_email;
		this.student_resume = student_resume;
		this.student_comment = student_comment;
	}



	@OneToMany(mappedBy = "s1", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Feedback> student_feedback = new ArrayList<>();


	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", student_name=" + studentName + ", student_phone="
				+ student_phone + ", student_email=" + student_email + ", student_resume=" + student_resume
				+ ", student_comment=" + student_comment + ", student_feedback=" + student_feedback + "]";
	}


	public Student(int student_id, String studentName, long student_phone, String student_email, String student_resume,
			String student_comment, List<Feedback> student_feedback) {
		super();
		this.student_id = student_id;
		this.studentName = studentName;
		this.student_phone = student_phone;
		this.student_email = student_email;
		this.student_resume = student_resume;
		this.student_comment = student_comment;
		this.student_feedback = student_feedback;
	}


	public List<Feedback> getStudent_feedback() {
		return student_feedback;
	}


	public void setStudent_feedback(List<Feedback> student_feedback) {
		this.student_feedback = student_feedback;
	}
	
}
