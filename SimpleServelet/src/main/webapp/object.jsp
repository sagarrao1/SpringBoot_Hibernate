<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%  String userName=request.getParameter("name");
		if (userName!=""& userName !=null){
			session.setAttribute("sessionUserName", userName);
			application.setAttribute("applicationUserName",userName);
			pageContext.setAttribute("PageCtxUserName", userName, pageContext.APPLICATION_SCOPE);
		}		
	%>
	<br>
	The user name is <%=userName%><br>
	The session user name is <%= session.getAttribute("sessionUserName")%><br>
	The application user name is <%=application.getAttribute("applicationUserName")%><br>
	The pageContext user name is <%=pageContext.getAttribute("PageCtxUserName")%><br>
</body>
</html>