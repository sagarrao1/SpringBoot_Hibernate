package com.javabrains.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javabrains.dto.User;
import com.javabrains.service.LoginService;

public class LoginServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uid;
		String pwd;
		
		uid=request.getParameter("uid");
		pwd =request.getParameter("pwd");		
		
		LoginService l = new LoginService();
		boolean validUser= l.authenticate(uid, pwd);		
				
		if(validUser) {
			User user=l.getUserDetails(uid);
			System.out.println("user object from getuserDetails() :"+user);
			//request.getSession().setAttribute("user", user);
			//response.sendRedirect("success.jsp");
			RequestDispatcher dispatcher= request.getRequestDispatcher("success.jsp");
			request.setAttribute("user", user);
			dispatcher.forward(request, response);			
			return;
		}else {
			response.sendRedirect("login.jsp");
			return;
		}
		
	}
}