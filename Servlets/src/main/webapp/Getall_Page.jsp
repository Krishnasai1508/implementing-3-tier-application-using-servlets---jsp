
<%@ page import="com.studentsdetails.dto.Students_Details" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>GetAll Student Details Page</title>

<link rel="stylesheet"  text="text/css"  href="Getall_Page.css">

</head>
<body>

	<table border="2">
		
		<tr>
			<td>Student_No</td>
			<td>Student_Name</td>
			<td>Branch</td>
			<td>Email_Id</td>
			<td>Password</td>
			<td>Moblie_No</td>
			<td>Delete</td>
			<td>Update</td>
		</tr>
		
		<% for(Students_Details students_details : details) { %>
		
		<tr>
			
			<td> <%= students_details.getStudent_No() %> </td>
			<td> <%= students_details.getStudent_Name() %> </td>
			<td> <%= students_details.getBranch() %> </td>
			<td> <%= students_details.getEmail_Id() %> </td>
			<td> <%= students_details.getPassword() %> </td>
			<td> <%= students_details.getMobile_No() %> </td>
			
			<td> <a href="delete?id=<%= students_details.getStudent_No() %>">Delete</a> </td>
			<td> <a href="get?id=<%= students_details.getStudent_No() %>">Update</a> </td>
			
		</tr>
		
		<% } %>
		
	</table>

</body>
</html>