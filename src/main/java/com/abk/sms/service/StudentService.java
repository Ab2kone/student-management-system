package com.abk.sms.service;
import java.util.List;

import com.abk.sms.entity.Student;
public interface StudentService {
	
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student updateStudent(Student student);
	
	Student getStduentById(Long id);

}
