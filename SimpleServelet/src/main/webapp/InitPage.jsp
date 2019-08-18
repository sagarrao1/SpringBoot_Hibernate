<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%! public void jspInit() {
	String DefaultUser1= getServletConfig().getInitParameter("DefaultUser1");
	ServletContext context= getServletContext();
	context.setAttribute("DefaultUser1Ctx", DefaultUser1);
}
%>
<body>
<br>
	DefaultUser1 from servelet config is : <%=getServletConfig().getInitParameter("DefaultUser1") %><br>
	DefaultUser1 from servelet context is :<%=getServletContext().getAttribute("DefaultUser1Ctx") %>
</body>
</html>
