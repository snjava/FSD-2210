<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Login Page</title>
</head>
<body>
<div align="center">
	<%
		String code = request.getParameter("c");
		String msg="";
		String color="";
		if(code!=null){
			switch(code) {
				case "3" :
					color="red";
					msg="Invalid User Name or Password";
					break;
				case "5" :
					color="red";
					msg="Your session has been timeout, Please sign-in again..";
					break;
				case "4" :
					color="green";
					msg="You Logged out successfully...";
					break;
			}
		}
	%>
	
<%
	String value = "";
	Cookie cks[] = request.getCookies();
	if(cks != null) {
		for(Cookie ck : cks) {
			if("userName".equals(ck.getName())) {
				value = ck.getValue();
			}
		}
	}
%>

		<h1>User Login Page</h1>
		
		<h3 style="color: <%=color%>"><%=msg%></h3>
		
		<form action="user-validate" method="get">
			Enter User Name : <input type="text" name="uname" value="<%=value%>"> <br><br>
			Enter Password: <input type="password" name="pass"> <br><br>
			<input type="checkbox" name="remember"> Remember me? <br><br>
			<button type="submit">Sign-In</button>
		</form>
	</div>
</body>
</html>