<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
</head>
<body>
	<h3> Login Successfull</h3>
	<%
	//User user= (User) session.getAttribute("user");
	//User user= (User) request.getAttribute("user");
	%>
	
	<jsp:useBean id="user" class="com.javabrains.dto.User" scope="request">
		<jsp:setProperty property="uname" name="user" value="setting user from JSTL"/>		
		<jsp:setProperty property="uid" name="user" value="104"/>
	</jsp:useBean>	
	Hello <jsp:getProperty property="uname" name="user"/> !!. How are you ! <br>
	id : <jsp:getProperty property="uid" name="user"/>
	
</body>
</html>