<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Details LogIn Page</title>

<link  rel="stylesheet" type="text/css" href="Login_Page.css">

</head>
<body>

	<form action="login" method="get">
		<table>
			<tr><td>Email ID</td><td><input type="text" name="email_Id" ></td></tr>
			<tr><td>Password</td><td><input type="password" name="password" ></td></tr>
			<tr><th colspan="2"><input type="submit" value="Login"></th></tr>
		</table>
	</form>

</body>
</html>