package com.javabrains.service;

public class LoginService {

	public boolean authenticate(String name,String pwd) {
		if(pwd==null  || pwd=="") {
			return false;
		}		
		return true;
	}
}
