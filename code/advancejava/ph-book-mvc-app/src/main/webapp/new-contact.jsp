<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create New Contact Number</title>
</head>
<body>

<%@ include file="menu.jsp" %>

<div align="center">

	<%
		String code = request.getParameter("c");
		String color="";
		String msg= "";
		if(code != null) {
			switch(code) {
				case "1":
					msg ="Contact Created Successfully";
					color = "green";
					break;
				case "5":
					msg ="Contact Creation Failed";
					color = "red";
			}
		
		}
	%>
	<h3 style="color: <%=color%>"> <%= msg %> </h3>
	<form action="new-contact">
	 	Enter First Name : <input type="text" name="fname"><br><br>
	 	Enter Last Name : <input type="text" name="lname"><br><br>
	 	Enter Contact : <input type="text" name="contact"><br><br>
	 	<button type="submit">Create New</button>
 	</form>
</div>


</body>
</html>