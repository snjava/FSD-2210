<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Educational Information</title>
</head>
<body>

<%
	String name = request.getParameter("name");
	String email = request.getParameter("email");
	String contact = request.getParameter("contact");
	String gender = request.getParameter("gender");
%>

<div align="center">
	<h2>Page 2 of 4</h2>
	<hr>
	<form action="address-info.jsp">
		<input type="hidden" name="name" value="<%=name%>">
		<input type="hidden" name="email" value="<%=email%>">
		<input type="hidden" name="contact" value="<%=contact%>">
		<input type="hidden" name="gender" value="<%=gender%>">
		Enter Higher Education : <input type="text" name="title"><br><br>
		Enter College Name : <input type="text" name="clgName"><br><br>
		Enter Percentage : <input type="text" name="percent"><br><br>
		Enter Passing Year : <input type="text" name="year"><br><br>
		<input type="submit" value="Next">
	</form>
</div>
</body>
</html>