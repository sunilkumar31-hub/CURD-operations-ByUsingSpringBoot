package com.firstspringboot.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.firstspringboot.entity.StudentDetails;
import com.firstspringboot.repository.StudentRepository;

@Component
public class StudentDAO {
	@Autowired
	StudentRepository studentRepository;
	
	public StudentDetails insertStudentDetails(StudentDetails studentDetails) {
		return studentRepository.save(studentDetails);
	}
	
	public List<StudentDetails> selectAllStudemtDetails() {
			return	studentRepository.findAll();
	}
	public List<StudentDetails> byName(String name){
		return studentRepository.readByName(name);
	}
	public StudentDetails byEmail(String email) {
		return studentRepository.readByEmailid(email);
	}
	public List<StudentDetails> byDept(String dept){
		return studentRepository.readByDept(dept);
	}
	public List<StudentDetails> byInput(String filter){
		return studentRepository.readByNameOrEmailidOrPasswordOrGenderOrDept(filter);
	}
}
