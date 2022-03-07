<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>
</head>
<body>

<%
	if(session.getAttribute("user") == null) {
		response.sendRedirect("login.jsp?c=5");
	}
%>


<div align="right">
	<h3>Welcome User, <%= session.getAttribute("user") %></h3>
	<h4><a href="logout">Logout</a></h4>
</div>

<hr>

<div align="center">
	<h1>This is the users home Page</h1>
</div>

</body>
</html>