package com.javabrains;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servelet2
 */
public class Servelet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter writer= response.getWriter();
		writer.println("<br>");
		writer.println("Default Username from servelet1 context is : "+getServletContext().getAttribute("DefaultUserCtx"));
		
		writer.println("<br> Default Username from initJsp server context is : "+this.getServletContext().getAttribute("DefaultUser1Ctx"));
		
		writer.println("<br> Default Username from servelet context from web.xml : "+this.getServletContext().getInitParameter("context_user"));
		
	}

}
