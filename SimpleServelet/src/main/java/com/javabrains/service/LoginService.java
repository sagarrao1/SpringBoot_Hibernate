package com.javabrains.service;

import java.util.HashMap;

import com.javabrains.dto.User;

public class LoginService {
	
	HashMap<String, String> users= new HashMap<String, String>();	

	public LoginService() {		
		users.put("101", "Sagar rao");
		users.put("102", "Sanju");
		users.put("103", "Murali");
		users.put("104", "Raghu");
	}


	public boolean authenticate(String uid,String pwd) {
		if(pwd==null  || pwd=="") {
			return false;
		}		
		
		return true;
	}
	
	public User getUserDetails(String uid) {
		User user= new User();
		user.setUid(uid);
		user.setUname(users.get(uid));
		return user;
	}
}