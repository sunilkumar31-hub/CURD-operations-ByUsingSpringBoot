package com.firstspringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.firstspringboot.dao.StudentDAO;
import com.firstspringboot.entity.StudentDetails;
import com.firstspringboot.exception.StudentException;
@Component
public class StudentService {
	@Autowired
	StudentDAO studentDAO;
	public StudentDetails studentRegistration(StudentDetails studentDetails) {
		List<StudentDetails> allStudemtDetails = studentDAO.selectAllStudemtDetails();
		int count = 0;
		for (StudentDetails studentDetails2 : allStudemtDetails) {
			if (studentDetails2.getNumber() == studentDetails.getNumber()) {
				count++;
			}

			if (count == 0) {
				System.out.println("ok ");
			} else {
				throw new StudentException("Student number is already exist");
			}

			int count1 = 0;

			if (studentDetails2.getEmailid().equals(studentDetails.getEmailid())) {
				count1++;
			}

			if (count1 == 0) {
				System.out.println("ok ");
			} else {
				throw new StudentException("Student emailid is already exist");
			}

			int count2 = 0;

			if (studentDetails2.getPassword().equals(studentDetails.getPassword())) {
				count2++;
			}

			if (count2 == 0) {
				System.out.println("ok ");
			} else {
				throw new StudentException("Student password is already exist");
			}
			

		}
		
		return studentDAO.insertStudentDetails(studentDetails);
	}
	public List<StudentDetails> allStudentDetails() {
		return studentDAO.selectAllStudemtDetails();
	}
	public List<StudentDetails> findByName(String name) {
		return studentDAO.byName(name);
	}
	public StudentDetails findByEmail(String email){
		return studentDAO.byEmail(email);
	}
	public List<StudentDetails> filterByDept(String dept){
		return studentDAO.byDept(dept);
	}
	public List<StudentDetails> filterByInput(String filter){
		return studentDAO.byInput(filter);
	}
}
