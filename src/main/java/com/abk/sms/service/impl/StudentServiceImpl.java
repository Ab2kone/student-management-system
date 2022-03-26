package com.abk.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.abk.sms.entity.Student;
import com.abk.sms.repository.StudentRepository;
import com.abk.sms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	private StudentRepository StudentRepository;
	
	

	public StudentServiceImpl(com.abk.sms.repository.StudentRepository studentRepository) {
		super();
		StudentRepository = studentRepository;
	}



	@Override
	public List<Student> getAllStudents() {
		
		return StudentRepository.findAll();
	}



	@Override
	public Student saveStudent(Student student) {
		
		return StudentRepository.save(student);
	}
	
	

}
