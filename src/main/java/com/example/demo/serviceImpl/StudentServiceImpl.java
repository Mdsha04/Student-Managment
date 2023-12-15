package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.FeedbackRepository;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService {

	
	@Autowired
	private StudentRepository studentrepository;
	
	@Autowired FeedbackRepository feedbackrepository;
	
	@Override
	public List<Student>getAllStudents(){
		return studentrepository.findAll();
	}
	@Override
	public Student SaveStudent(Student student) {
		return studentrepository.save(student);
	}
	@Override
	public Student updateStudent(Student student) {
		return studentrepository.save(student);
	}
	@Override
	public Student getStudentById(int student_id) {
		Student S= studentrepository.findById(student_id).get();
		System.out.println(S);
		return studentrepository.findById(student_id).get();
	}
	@Override
	public void deleteStudentById(int student_id) {
		studentrepository.deleteById(student_id);
	}
			
	@Override
	 public List<Student> searchStudents(String studentName) {
	    return studentrepository.findByStudentName(studentName);
	}
	
	
}



//@Override
//public Student getStudentById(int student_id) {
//	Student student= studentrepository.findById(student_id).get();
//	student.setS1(this.feedbackrepository.findById(student_id));
//	return student;
//}
