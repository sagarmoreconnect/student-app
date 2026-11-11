package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Student;

public interface StudentService {

	
	Student createStudent(Student student);
	
	Student getStudent(Long id);
	
	List<Student> getAllStudents();
}
