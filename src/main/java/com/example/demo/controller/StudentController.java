package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.serviceImpl.StudentServiceImpl;

@RestController
@CrossOrigin
@RequestMapping("/api/students")
public class StudentController {

	
	private final StudentServiceImpl studentServiceImpl;
	
	public StudentController(StudentServiceImpl studentServiceImpl)
	{
		this.studentServiceImpl=studentServiceImpl;
	}
	
	@PostMapping
	public Student createStudent(@RequestBody Student student)
	{
		return studentServiceImpl.createStudent(student);
	}
		
	@GetMapping("/{id}")
		public Student getStudent(@PathVariable Long id)
		{
			return studentServiceImpl.getStudent(id);
		}
		
	@GetMapping
		public List<Student> getAllStudents()
		{
			return studentServiceImpl.getAllStudents();
		}
	
}
