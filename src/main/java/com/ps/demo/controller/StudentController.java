package com.ps.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.ps.demo.dto.Student;
import com.ps.demo.service.StudentSevice;

@Controller
public class StudentController {

	private StudentSevice service;

	public StudentController(StudentSevice service) {
		super();
		this.service = service;
	}

	@GetMapping("/getAll")
	public String getAllStudents(Model model) {
		model.addAttribute("students", service.getAllStudents());
		return "students";
	}

	@GetMapping("/getAll/new")
	public String createStudentForm(Model model) {
		Student s1 = new Student();
		model.addAttribute("student", s1);
		return "create_student";
	}

	@PostMapping("/getAll")
	public String saveStudent(@ModelAttribute("student") Student student) {
		service.saveStudent(student);
		return "redirect:/getAll";
	}
	
	@GetMapping("/getAll/edit/{id}")
	public String editStudentForm(@PathVariable Long id,Model model) {
		model.addAttribute("student", service.getStudentById(id));
		return "edit_student";
	}
	@PostMapping("/getAll/{id}")
	public String updateStudent(@PathVariable Long id ,@ModelAttribute("student") Student student,Model model) {
		//get student from database by id
		Student existingStudent=service.getStudentById(id);
		existingStudent.setId(id);
		existingStudent.setFirstName(student.getFirstName());
		existingStudent.setLastName(student.getLastName());
		existingStudent.setEmail(student.getEmail());
		
		//save update student object
		service.updateStudent(existingStudent);
		return "redirect:/getAll";
		
	}
	
	//handler method to handle delete student request
	
	@GetMapping("/getAll/{id}")
	public String deleteStudent(@PathVariable Long id) {
		service.deleteStudent(id);
		return "redirect:/getAll";
		
	}
}