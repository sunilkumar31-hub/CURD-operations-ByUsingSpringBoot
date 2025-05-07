package com.firstspringboot.exception;

public class StudentException extends RuntimeException {
	
	private String exceptionmsg;

	

	public StudentException(String exceptionmsg) {
		super();
		this.exceptionmsg = exceptionmsg;
	}

	public String getExceptionmsg() {
		return exceptionmsg;
	}

	public void setExceptionmsg(String exceptionmsg) {
		this.exceptionmsg = exceptionmsg;
	}

}
