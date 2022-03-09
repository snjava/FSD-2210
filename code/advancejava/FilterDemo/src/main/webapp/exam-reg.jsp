<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Exam Registration</title>
</head>
<body>
	<div align="center">
		<h2>Exam Registration Form</h2>
		
		<%
			ArrayList<String> errors = (ArrayList<String>) request.getAttribute("errors");
			if(errors != null){
				for(String err : errors) {
					%>
					<h5 style="color: red"><%=err%></h5>
					<%
				}
			}
		%>
		
		<form action="reg-user">
			Enter Name : <input type="text" name="uname"> <br><br>
			Enter Contact : <input type="text" name="contact"> <br><br>
			Enter Age : <input type="text" name="age"> <br><br>
			Enter Email : <input type="text" name="email"> <br><br>
			<button type="submit">Register</button>
		</form>
	</div>
</body>
</html>