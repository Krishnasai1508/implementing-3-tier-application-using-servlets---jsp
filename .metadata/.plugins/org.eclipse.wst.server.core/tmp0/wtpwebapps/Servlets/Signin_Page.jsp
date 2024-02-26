<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Details SignIn Page</title>

<link rel="stylesheet" type="text/css" href="Signin_Page.css">

</head>
<body>

	<% String message = (String) request.getAttribute("message"); 
		
		if (message != null) { 
	%>		
			<h1><%= message %></h1>
			
		<% } %>

	
	<form action="signin" method="post">
		
		
		<table>
			
			<tr>
				<td><label for="student_Name">Enter Student Name : </label></td>
				<td><input type="text" name="student_Name" id="student_Name"></td>
			</tr>
			
			<tr>
				<td><label for="branch">Enter Student Branch : </label></td>
				<td><input type="text" name="branch" id="branch"></td>
			</tr>
			
			<tr>
				<td><label for="email_Id">Enter Student Email Id : </label></td>
				<td><input type="email" name="email_Id" id="email_Id"></td>
			</tr>
			
			<tr>
				<td><label for="password">Enter Password : </label></td>
				<td><input type="password" name="password" id="password"></td>
			</tr>
			
			<tr>
				<td><label for="moblie_No">Enter Student Mobile No : </label></td>
				<td><input type="tel" name="moblie_No" id="moblie_No"></td>
			</tr>
			
			<tr>
				<th colspan="2"><input type="submit" class="submit"></th>
			</tr>
			
		</table>
		
		
	</form>
	

</body>
</html>