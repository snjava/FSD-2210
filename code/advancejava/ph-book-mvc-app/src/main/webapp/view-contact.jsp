<%@page import="dto.Contact"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Contacts</title>
</head>
<body>

<%@ include file="menu.jsp" %>

<div align="center">
	<table border="1">
		<thead>
			<tr>
				<th>Id</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Number</th>
				<th>Edit / Delete</th>
			</tr>
		</thead>
		<tbody>
			<% List<Contact> list = (List<Contact>) request.getAttribute("contactList");  %>
			<% for( Contact c : list) { %>
			<tr>
				<td> <%= c.getId() %> </td>
				<td> <%= c.getFname() %> </td>
				<td> <%= c.getLname() %> </td>
				<td> <%= c.getMobNum() %> </td>
				<td> 
					<a href="#?id<%= c.getId() %>">Edit</a> / 
					<a href="#?id<%= c.getId() %>">Delete</a>
				 </td>
			</tr>
			<% } %>
		</tbody>
	</table>
</div>


</body>
</html>