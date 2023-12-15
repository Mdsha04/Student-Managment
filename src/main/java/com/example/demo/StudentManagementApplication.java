package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;


@ComponentScan("com.*")
@SpringBootApplication
public class StudentManagementApplication {
//implements CommandLineRunner 
	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}

	
//	@Autowired 
//	private StudentRepository studentrepository;
//		@Override
//		public void run(String... args) throws Exception {
//			Student s1=new Student("shaquib",12344,"shaquib@gmail.com","download btn","Good");
//			Student s2=new Student("sairaj",155554,"sairaj@gmail.com","load btn","nice");
//			Student s3=new Student("shaquib",12344,"shaquib@gmail.com","download btn","Good");
//
//			//studentrepository.save(s1);
//			studentrepository.delete(s3);
//		}
}
