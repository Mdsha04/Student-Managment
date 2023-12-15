package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer>{
	
	 List<Student> findByStudentName(String studentName);
	 
}
