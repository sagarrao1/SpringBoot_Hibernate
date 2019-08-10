package com.javabrains;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//@WebServlet(description = "a Servelet-path description", urlPatterns = "/Servelet-path1",
//  initParams = {@WebInitParam(name = "DefaultUser", value = "Sandhya Darling")}  
//		)
public class Servelet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter writer=  response.getWriter();
		System.out.println("Hello world from doGet servelet1");
		writer.println("<h4> Hello world from doGet servelet1</h4>");
		String userName= request.getParameter("name");
		HttpSession session= request.getSession();
		ServletContext context=request.getServletContext();
		
		if (userName !="" & userName != null) {
		session.setAttribute("saveUserName", userName);
		context.setAttribute("saveCtxUserName", userName);
		}
		
		
		writer.println("Username from request Object: "+userName+"<br>");
		writer.println("Username from session Object: "+(String)session.getAttribute("saveUserName")+"<br>");
		writer.println("Username from context Object: "+(String)context.getAttribute("saveCtxUserName")+"<br>");
		
		writer.println("Default Username from init Parameter: "+this.getServletConfig().getInitParameter("DefaultUser")+"<br>");
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
		// TODO Auto-generated method stub
	  response.getWriter().append("Served at: ").append(request.getContextPath());
	  PrintWriter writer= response.getWriter();
	  System.out.println("Hello world from doPOST servelet1");
	  //writer.println("<h4> Hello world from doPOST servelet1</h4>"); 
	  String userName= request.getParameter("userName");
	  String fullName= request.getParameter("fullName");
	  writer.println("<h4> Hello from doPOST : "+userName+" and your full name is : "+fullName+"</h4>"); 
	  
	  String prof= request.getParameter("prof");
	  writer.println("You are a : "+prof+"<br><br>");	  
	  
	  String[] location= request.getParameterValues("location");
	  writer.println("Your location is : <br>");
	  for (String string : location) {
		  writer.println(string+"<br>");
	}
	  
	}
	
}
