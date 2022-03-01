<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Preview</title>
</head>
<body>
<div align="center">
<%
	String name = request.getParameter("name");
	String email = request.getParameter("email");
	String contact = request.getParameter("contact");
	String gender = request.getParameter("gender");
	
	String title = request.getParameter("title");
	String clg = request.getParameter("clgName");
	String percent = request.getParameter("percent");
	String year = request.getParameter("year");
	
	String city = request.getParameter("city");
	String pin = request.getParameter("pin");
	String mark = request.getParameter("mark");
	String state = request.getParameter("state");
%>
	<h2>Page 4 of 4</h2>
	<hr>
	<h3>--------Personal Details----------</h3>
		<h4>Name : <%= name %> </h4>
		<h4>Email : <%= email %> </h4>
		<h4>Contact : <%= contact %> </h4>
		<h4>Gender : <%= gender %> </h4>
	<h3>--------Educational Details----------</h3>
		<h4>Title : <%= title %> </h4>
		<h4>Percent : <%= percent %> </h4>
		<h4>Passing Year : <%= year %> </h4>
		<h4>College Name : <%= clg %> </h4>
	<h3>--------Address Details----------</h3>
		<h4>City : <%= city %> </h4>
		<h4>Pin code : <%= pin %> </h4>
		<h4>State : <%= state %> </h4>
		<h4>LandMark : <%= mark %> </h4>
	
	<h2>|  <a href="save-details?name=<%= name %>&email=<%= email %>&contact=<%= contact %>"> Save </a>  |</h2>
</div>
</body>
</html>








