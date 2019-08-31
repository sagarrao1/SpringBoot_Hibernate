<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h4>Enter Student details</h4>
	<form action="addstudent">
		<input type="text" name="id" value="id">
		<input type="text" name="name" value="name">
		<input type="text" name="technology" value="technology">
		<input type="submit">
	</form>	
	
	<form action="getstudent">
		<input type="text" name="id" value="id">
		<input type="submit">
	</form>	
	
	
	 
</body>
</html>