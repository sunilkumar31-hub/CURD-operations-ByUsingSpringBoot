package com.firstspringboot.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class studentExceptionHandler {

	
		@ExceptionHandler(StudentException.class)
	public String studentRelatedException(StudentException studentException ,Model model) {
		 String exceptionmsg = studentException.getExceptionmsg();
		model.addAttribute("exceptionmsg", exceptionmsg);
		return "StudentRegistration";
	}
}
