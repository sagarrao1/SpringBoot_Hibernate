<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import ="com.javabrains.dto.Customer"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>processed details</title>
</head>
<body>
<%
	String cname= request.getParameter("customerName");
	System.out.println("cc:"+cname );
%>

 <jsp:useBean id="customer" class="com.javabrains.dto.Customer" scope="request">
 	<jsp:setProperty property="customerName" name="customer" param="customerName"/> 
 </jsp:useBean>
 
   Hello <jsp:getProperty property="customerName" name="customer"/><br>
</body>
</html>