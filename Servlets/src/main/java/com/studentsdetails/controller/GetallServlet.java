package com.studentsdetails.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.studentsdetails.dao.StudentDao;
import com.studentsdetails.dto.Students_Details;



@WebServlet("/getall")
public class GetallServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		StudentDao studentDao = new StudentDao();
		
		List<Students_Details> students_details = studentDao.getAllStudentsDetails() ;
		
		req.setAttribute("list", students_details);
		
		req.getRequestDispatcher("Getall_page.jsp").forward(req, resp);
		
	}
	
}
