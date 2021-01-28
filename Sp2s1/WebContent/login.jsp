<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<h1>Please enter your login information:</h1>
	
	<form id = "login" action = "login" method = "post">
	<label>Username:</label>
	<input type = "text" name = "username">
	<br>
	<label>Password:</label>
	<input type = "text" name = "password">
	<button type = "submit">Submit</button>
	</form>

</body>
</html>