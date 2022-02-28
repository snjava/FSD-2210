<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Input</title>
</head>
<body>

<div align="center">
	<form action="result.jsp">
		Enter 1st Number : <input type="text" name="num1"><br><br>
		Enter 2nd Number : <input type="text" name="num2"><br><br>
		Select Operation : <select name="operation">
								<option value="+"> + </option>
								<option value="-"> - </option>
								<option value="/"> / </option>
								<option value="*"> * </option>
							</select>
					<br><br>
		<input type="submit" value="Calculate">
	</form>
</div>

</body>
</html>