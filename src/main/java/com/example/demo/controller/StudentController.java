package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

import org.springframework.ui.Model;


@Controller
public class StudentController {

	@Autowired
	private StudentService studentservice;
	
	@GetMapping("/students")
	public String StudentList(Model model) {
		model.addAttribute("students",studentservice.getAllStudents());
		return "students";
	}
	
	@GetMapping("/student/showall")
	public List<Student> getAllStudent(){
			return studentservice.getAllStudents();
	}
	
	@GetMapping("/students/new")
	public String createStudentForm(Model model) {
		Student student = new Student();
		model.addAttribute("student",student);
		return "create_student";
	}

	@PostMapping("/students")
public String SaveStudent(@ModelAttribute("student")Student student){
		studentservice.SaveStudent(student);
		return "redirect:/students";
}
	@GetMapping("/students/edit/{student_id}")
	public String editStudentForm(@PathVariable int student_id ,Model model) {
		model.addAttribute("student",studentservice.getStudentById(student_id));
		return "edit_student";
	}
	@PostMapping("/students/{student_id}")
	public String updateStudent(@PathVariable int student_id,
			@ModelAttribute("student")Student student,
			Model model) {
		
		Student existingStudent=studentservice.getStudentById(student_id);
		existingStudent.setStudent_id(student_id);
		existingStudent.setStudentName(student.getStudentName());
		existingStudent.setStudent_phone(student.getStudent_phone());
		existingStudent.setStudent_email(student.getStudent_email());
		existingStudent.setStudent_comment(student.getStudent_comment());
		existingStudent.setStudent_resume(student.getStudent_resume());
				
		studentservice.updateStudent(existingStudent);
		return "redirect:/students";
	}
	
	@GetMapping("/students/{student_id}")
	public String deleteStudent(@PathVariable int student_id) {
		studentservice.deleteStudentById(student_id);
		return "redirect:/students";
	}
	
	
	
    @GetMapping("/students/detail/{student_id}")
    public String getStudentById(@PathVariable int student_id, Model model) {
        Student student = studentservice.getStudentById(student_id);
        model.addAttribute("student", student);
        return "student_detail"; 
    }
    
    
    
//	  @GetMapping("/students/detail/{student_name}")
//	  
//	  public String searchStudent(@PathVariable String student_name, Model model) {
//	        List<Student> student = studentservice.searchStudentByName(student_name);
//	        model.addAttribute("student", student);
//	        return "students";
//	    }
    
    @GetMapping("/search")
    public String searchStudents(@RequestParam String studentName, Model model) {
        List<Student> searchResults = studentservice.searchStudents(studentName);
        model.addAttribute("searchResults", searchResults);
        return "search_result";
    }
	 
}
