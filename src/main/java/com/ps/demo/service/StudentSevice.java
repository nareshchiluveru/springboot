package com.ps.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ps.demo.dao.StudentDao;
import com.ps.demo.dto.Student;

@Service
public class StudentSevice {
	
	private StudentDao dao;
	
	public StudentSevice(StudentDao dao) {
		super();
		this.dao = dao;
	}

	public List<Student> getAllStudents(){
		return dao.findAll();
	}
	
	public Student saveStudent(Student student) {
		return dao.save(student);
	}
	public Student getStudentById(Long id) {
		return dao.findById(id).get();
		
	}
	
	public Student updateStudent(Student student) {
		return dao.save(student);
		
	}
	
	public void deleteStudent(Long id) {
		dao.deleteById(id);
	}

}
