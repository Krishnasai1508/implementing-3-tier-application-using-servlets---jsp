package com.studentsdetails.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Students_Details {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int student_No;
	private String student_Name;
	private String branch;
	@Column(unique = true)
	private String email_Id;
	private String password;
	private long moblie_No;
	
	
	
	public int getStudent_No() {
		return student_No;
	}
	public void setStudent_No(int student_No) {
		this.student_No = student_No;
	}
	public String getStudent_Name() {
		return student_Name;
	}
	public void setStudent_Name(String student_Name) {
		this.student_Name = student_Name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getEmail_Id() {
		return email_Id;
	}
	public void setEmail_Id(String email_Id) {
		this.email_Id = email_Id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getMoblie_No() {
		return moblie_No;
	}
	public void setMoblie_No(long moblie_No) {
		this.moblie_No = moblie_No;
	}
	
	
	
	@Override
	public String toString() {
		return "Students_Details [student_No=" + student_No + ", student_Name=" + student_Name + ", branch=" + branch
				+ ", email_Id=" + email_Id + ", password=" + password + ", moblie_No=" + moblie_No + "]";
	}
	
	
}
