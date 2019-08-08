package com.javabrains;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(description = "a Servelet-path description", urlPatterns = "/Servelet-path1")
public class Servelet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter writer=  response.getWriter();
		System.out.println("Hello world from doGet servelet1");
		writer.println("<h4> Hello world from doGet servelet1</h4>");
		String userName= request.getParameter("userName");
		writer.println("<h1> Hello "+userName+"</h4>");		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
		// TODO Auto-generated method stub
	  response.getWriter().append("Served at: ").append(request.getContextPath());
	  PrintWriter writer= response.getWriter();
	  System.out.println("Hello world from doPOST servelet1");
	  writer.println("<h4> Hello world from doPOST servelet1</h4>"); String
	  userName= request.getParameter("userName");
	  writer.println("<h1> Hello from doPOST : "+userName+"</h4>"); 
	}
	
}
