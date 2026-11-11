package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;


@Service
public class StudentServiceImpl implements StudentService {

private final StudentRepository studentRepository;
	
	public StudentServiceImpl(StudentRepository studentRepository)
	{
		this.studentRepository = studentRepository;
	}
	
	
public Student createStudent(Student student)
{
	return studentRepository.save(student);
}
	
	public Student getStudent(Long id)
	{
		return studentRepository.findById(id).orElse(null);
	}
	
	public List<Student> getAllStudents()
	{
		return studentRepository.findAll();
	}





	
}
