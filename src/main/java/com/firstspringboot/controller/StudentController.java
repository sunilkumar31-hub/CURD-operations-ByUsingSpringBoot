package com.firstspringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.firstspringboot.dao.StudentDAO;
import com.firstspringboot.entity.StudentDetails;
import com.firstspringboot.service.StudentService;

@Controller
public class StudentController {
	
	
	@Autowired
	StudentService studentService;

	@RequestMapping("/registration")
	public String studentRegistration(StudentDetails studentDetails) {
		studentService.studentRegistration(studentDetails);
		return "redirect:/allstudents";
	}
	
	
	@RequestMapping("/studentregistrationpage")
	public String studentRegistrationPage() {
		return "StudentRegistration";
	}
	
	@RequestMapping("/allstudents")
	public String allStudentDetails(Model model ){
		 List<StudentDetails> allStudentDetails = studentService.allStudentDetails();
		 model.addAttribute("allstudents", allStudentDetails);
		 return"AllStudentDetails";
	}
	@RequestMapping("/byname")
	public String filterByName(@RequestParam("name") String name,Model model) {
		List<StudentDetails> byName = studentService.findByName(name);
		model.addAttribute("allstudents", byName);
		return "AllStudentDetails";
	}
	@RequestMapping("/byemail")
	public String filterByEmail(@RequestParam("email") String eamil,Model model) {
		StudentDetails byEmail = studentService.findByEmail(eamil);
		model.addAttribute("allstudents", byEmail);
		return "AllStudentDetails";
	}
	@RequestMapping("/bydept")
	public String filterByDept(@RequestParam("dept") String dept,Model model) {
		List<StudentDetails> byDept = studentService.filterByDept(dept);
		model.addAttribute("allstudents", byDept);
		return "AllStudentDetails";
	}
	@RequestMapping("/byfilter")
	public String byFilter(@RequestParam("filter") String filter,Model model) {
		List<StudentDetails> filterByInput = studentService.filterByInput(filter);
		model.addAttribute("allstudents", filterByInput);
		return "AllStudentDetails";
	}
}
 