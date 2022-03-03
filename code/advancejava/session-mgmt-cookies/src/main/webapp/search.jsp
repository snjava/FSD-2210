<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search</title>
</head>
<body>

<div align="center">
<%
	String value = "";
	Cookie cks[] = request.getCookies();
	if(cks != null) {
		for(Cookie ck : cks) {
			System.out.println(ck.getName());
			if("search".equals(ck.getName())) {
				value = ck.getValue();
			}
		}
	}
%>
	<h3>Your Last Search is : <%= value %></h3>
	<form action="search-result">
		Search  : <input type="text" name="q" value="<%= value %>">
		<br><br>
		<button type="submit">Get Result</button>
	</form>


</div>

</body>
</html>