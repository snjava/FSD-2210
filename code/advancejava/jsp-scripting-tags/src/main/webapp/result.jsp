<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Output</title>
</head>
<body>

<%
	String num1 = request.getParameter("num1");
	String num2 = request.getParameter("num2");
	int n1 = Integer.parseInt(num1);
	int n2 = Integer.parseInt(num2);
	String opt = request.getParameter("operation");
	double ans = 0;
	switch(opt) {
	case "+" :
		ans = n1 + n2;	
		break;
	case "-" :
		ans = n1 - n2;	
		break;
	case "/" :
		ans = n1 / n2;	
		break;
	case "*" :
		ans = n1 * n2;	
		break;
	}
%>

<h1> <%= num1 %>  <%= opt %>  <%= num2 %>  =  <%= ans %> </h1>


</body>
</html>