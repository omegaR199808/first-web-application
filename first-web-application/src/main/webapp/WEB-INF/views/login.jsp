<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fist Web Application</title>
</head>
<body>
<p><font color="red">${errorMessage}</font></p>
<form action = "/login.do" method="post"> 
Enter your name: <input type="text" name = "name"/>
Enter your password:  <input type="password" name="password"/>
<input type="submit"/>

</form>

</body>
</html>