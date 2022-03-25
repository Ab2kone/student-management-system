package com.abk.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abk.sms.entity.Student;


public interface StudentRepository extends JpaRepository<Student, Long> {

}
