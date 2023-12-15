package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name="interview")
public class User {
	

	@Id
	@GeneratedValue(generator="interviewer_gen",strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(
		    name = "interviewer_gen",    
		    sequenceName = "interviewer_seq",  
		    initialValue = 1,          
		    allocationSize = 1          
		)
@Column(name="interviewer_Id")
	private int interviewer_Id;
	
	private String interviewer_Name;
	private int interviewer_Phone;
	private String interviewer_Email;
	private int interviewer_GCMlevel;
	private int interviewer_ManagerId;
	@NotBlank(message="DasId cannot be empty !!")
	private String dasId;
	@NotBlank(message="password cannot be empty !!")
	private String password;
	
	
	
	public User(int interviewer_Id, String interviewer_Name, int interviewer_Phone, String interviewer_Email,
			int interviewer_GCMlevel, int interviewer_ManagerId, String dasId, String password) {
		super();
		this.interviewer_Id = interviewer_Id;
		this.interviewer_Name = interviewer_Name;
		this.interviewer_Phone = interviewer_Phone;
		this.interviewer_Email = interviewer_Email;
		this.interviewer_GCMlevel = interviewer_GCMlevel;
		this.interviewer_ManagerId = interviewer_ManagerId;
		this.dasId = dasId;
		this.password = password;
	}



	public int getInterviewer_Id() {
		return interviewer_Id;
	}



	public void setInterviewer_Id(int interviewer_Id) {
		this.interviewer_Id = interviewer_Id;
	}



	public String getInterviewer_Name() {
		return interviewer_Name;
	}



	public void setInterviewer_Name(String interviewer_Name) {
		this.interviewer_Name = interviewer_Name;
	}



	public int getInterviewer_Phone() {
		return interviewer_Phone;
	}



	public void setInterviewer_Phone(int interviewer_Phone) {
		this.interviewer_Phone = interviewer_Phone;
	}



	public String getInterviewer_Email() {
		return interviewer_Email;
	}



	public void setInterviewer_Email(String interviewer_Email) {
		this.interviewer_Email = interviewer_Email;
	}



	public int getInterviewer_GCMlevel() {
		return interviewer_GCMlevel;
	}



	public void setInterviewer_GCMlevel(int interviewer_GCMlevel) {
		this.interviewer_GCMlevel = interviewer_GCMlevel;
	}



	public int getInterviewer_ManagerId() {
		return interviewer_ManagerId;
	}



	public void setInterviewer_ManagerId(int interviewer_ManagerId) {
		this.interviewer_ManagerId = interviewer_ManagerId;
	}



	public String getDasId() {
		return dasId;
	}



	public void setDasId(String dasId) {
		this.dasId = dasId;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public User() {
		super();
	}
	
}
