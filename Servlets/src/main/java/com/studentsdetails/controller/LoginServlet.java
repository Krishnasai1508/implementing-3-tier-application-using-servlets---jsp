package com.studentsdetails.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.studentsdetails.dao.StudentDao;
import com.studentsdetails.dto.Students_Details;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String email_Id = req.getParameter("email_Id");
		String password = req.getParameter("password");
		
		StudentDao studentDao = new StudentDao();
		
		Students_Details students_Details = (Students_Details) studentDao.getStudentsDetails(email_Id);
		
		
		
		if (students_Details != null) {
			
			if (password.equals(students_Details.getPassword())) {
				
				req.getRequestDispatcher("getall").forward(req, resp);
				
			}
			else {
				
				resp.getWriter().print("<h1>Invaild Password</h1>");
				
				req.getRequestDispatcher("Login_Page.jsp").include(req, resp);
				
			}
			
		}
		else {
			
			resp.getWriter().print("<h1>Invaild Email ID</h1>");
			
			req.getRequestDispatcher("Login_Page.jsp").include(req, resp);
			
		}
		
		
		
		
	}
	

}
