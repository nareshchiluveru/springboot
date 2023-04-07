package com.ps.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ps.demo.dao.StudentDao;
import com.ps.demo.dto.Student;

@SpringBootApplication
public class StudentMngServiceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentMngServiceApplication.class, args);
	}

	@Autowired
	private StudentDao dao;

	@Override
	public void run(String... args) throws Exception {
		/*
		 * Student s1 = new Student("naresh", "chiluveru", "naresh@gmail.com");
		 * dao.save(s1);
		 * 
		 * Student s2 = new Student("mahesh", "gadidhala", "mahesh@gmail.com");
		 * dao.save(s2);
		 * 
		 * Student s3 = new Student("lokeh", "narsing", "lokesh@gmail.com");
		 * dao.save(s3);
		 */

	}

}
