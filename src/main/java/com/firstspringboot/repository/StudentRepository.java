package com.firstspringboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.firstspringboot.entity.StudentDetails;

public interface StudentRepository extends JpaRepository<StudentDetails, Long>
{
	List<StudentDetails> readByName(String name);
	
	StudentDetails readByEmailid(String email);
	
	List<StudentDetails> readByDept(String dept);
	
	@Query("select student from StudentDetails student where student.name=?1 or student.emailid=?1 or student.password=?1or student.gender=?1 or student.dept=?1 ")
	 
	List<StudentDetails> readByNameOrEmailidOrPasswordOrGenderOrDept(String filter);
}
