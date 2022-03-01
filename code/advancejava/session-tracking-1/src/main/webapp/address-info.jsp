<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Address Information</title>
</head>
<body>
<%
	String name = request.getParameter("name");
	String email = request.getParameter("email");
	String contact = request.getParameter("contact");
	String gender = request.getParameter("gender");
	
	String title = request.getParameter("title");
	String clg = request.getParameter("clgName");
	String percent = request.getParameter("percent");
	String year = request.getParameter("year");
%>

<div align="center">
	<h2>Page 3 of 4</h2>
	<hr>
	<form action="preview.jsp">
		<input type="hidden" name="name" value="<%=name%>">
		<input type="hidden" name="email" value="<%=email%>">
		<input type="hidden" name="contact" value="<%=contact%>">
		<input type="hidden" name="gender" value="<%=gender%>">
		
		<input type="hidden" name="title" value="<%=title%>">
		<input type="hidden" name="clgName" value="<%=clg%>">
		<input type="hidden" name="percent" value="<%=percent%>">
		<input type="hidden" name="year" value="<%=year%>">
		
		Enter City : <input type="text" name="city"><br><br>
		Enter Pin code : <input type="text" name="pin"><br><br>
		Enter State : <input type="text" name="state"><br><br>
		Enter Landmark : <input type="text" name="mark"><br><br>
		<input type="submit" value="Preview">
	</form>
</div>
</body>
</html>