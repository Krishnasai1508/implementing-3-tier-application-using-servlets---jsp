package com.studentsdetails.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.studentsdetails.dao.StudentDao;
import com.studentsdetails.dto.Students_Details;

@WebServlet("/signin")
public class SigninServlet extends HttpServlet {
	
	
	static Students_Details students_details = new Students_Details() ;
	
	static StudentDao studentdao = new StudentDao();
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String student_Name = req.getParameter("student_Name");
		String branch = req.getParameter("branch");
		String email_Id = req.getParameter("email_Id");
		String password = req.getParameter("password");
		long moblie_No = Long.parseLong(req.getParameter("moblie_No"));
		
		students_details.setStudent_Name(student_Name);
		students_details.setBranch(branch);
		students_details.setEmail_Id(email_Id);
		students_details.setPassword(password);
		students_details.setMoblie_No(moblie_No);
		
		studentdao.saveStudentDetails(students_details);
		
		req.setAttribute("message", "Data Saved Successfully");
		
		req.getRequestDispatcher("Signin_Page.jsp").forward(req, resp);
		
		
	}
	
	
}
