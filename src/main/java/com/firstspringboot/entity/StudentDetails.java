package com.firstspringboot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class StudentDetails {
	
		private String name;
		private String emailid;
		@Id
		private long number;
		private String password;
		private int age;
		private String gender;
		private String dept;
		private double percentage;
		
		
		public StudentDetails() {
			super();
		}


		public StudentDetails(String name, String emailid, long number, String password, int age, String gender,
				String dept, double percentage) {
			super();
			this.name = name;
			this.emailid = emailid;
			this.number = number;
			this.password = password;
			this.age = age;
			this.gender = gender;
			this.dept = dept;
			this.percentage = percentage;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getEmailid() {
			return emailid;
		}


		public void setEmailid(String emailid) {
			this.emailid = emailid;
		}


		public long getNumber() {
			return number;
		}


		public void setNumber(long number) {
			this.number = number;
		}


		public String getPassword() {
			return password;
		}


		public void setPassword(String password) {
			this.password = password;
		}


		public int getAge() {
			return age;
		}


		public void setAge(int age) {
			this.age = age;
		}


		public String getGender() {
			return gender;
		}


		public void setGender(String gender) {
			this.gender = gender;
		}


		public String getDept() {
			return dept;
		}


		public void setDept(String dept) {
			this.dept = dept;
		}


		public double getPercentage() {
			return percentage;
		}


		public void setPercentage(double percentage) {
			this.percentage = percentage;
		}


		@Override
		public String toString() {
			return "StudentDetails [name=" + name + ", emailid=" + emailid + ", number=" + number + ", password="
					+ password + ", age=" + age + ", gender=" + gender + ", dept=" + dept + ", percentage=" + percentage
					+ "]";
		}
		
		
		
		
}
