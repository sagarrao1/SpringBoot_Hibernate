package com.javabrains.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javabrains.service.LoginService;

public class LoginServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname;
		String pwd;
		
		uname=request.getParameter("uname");
		pwd =request.getParameter("pwd");		
		
		LoginService l = new LoginService();
		boolean validUser= l.authenticate(uname, pwd);
		
		if(validUser) {
			response.sendRedirect("success.jsp");
			return;
		}else {
			response.sendRedirect("Login.jsp");
			return;
		}
		
	}
}
