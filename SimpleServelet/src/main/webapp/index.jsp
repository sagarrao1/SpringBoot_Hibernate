<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Hello World!</h2>
<br>
<%! public int add(int a, int b){
	return a+b;
}
%>

<%
  int i=2;
  int j=4;
  int k= i+j;
  
  //out.println("Value of k is :"+k);
%>

Value of k is: <%=k%>

<% k= add(2345, 5678);
%>
<br>
Value of k is: <%=k%>
<br>
<%
 for(i=0;i<10;i++){
//	 out.println("value of i is :"+i+"<br>");
 
%>
  value of i is :<%=i %><br>

<%}
%>

</body>
</html>
