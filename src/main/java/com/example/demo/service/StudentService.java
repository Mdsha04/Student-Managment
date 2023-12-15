package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Student;

public interface StudentService {
	
List<Student>getAllStudents();


Student SaveStudent(Student student);

Student updateStudent(Student student);

Student getStudentById(int student_id);

void deleteStudentById(int student_id);

List<Student> searchStudents(String studentName);

}
