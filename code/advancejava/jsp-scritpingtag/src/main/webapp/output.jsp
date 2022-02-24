<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">

	<%
		String number = request.getParameter("num");
		int num = Integer.parseInt(number);
	%>

	<h1> Result : <%= num * num %> </h1>
	
</div>
</body>
</html>