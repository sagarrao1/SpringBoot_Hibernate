<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import= "java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>clock</title>
</head>
<body>
<br>
 <%@ include file="/Hello.jsp" %>
 <br>
	<b>Current time is <%= new Date() %></b>
</body>
</html>