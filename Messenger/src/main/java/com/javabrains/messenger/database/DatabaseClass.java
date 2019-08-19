package com.javabrains.messenger.database;

import java.util.HashMap;
import java.util.Map;

import com.javabrains.messenger.model.Message;
import com.javabrains.messenger.model.Profile;


public class DatabaseClass {
	
	private static Map<Long, Message> messagesMap= new HashMap<>();
	private static Map<String, Profile> profilesMap= new HashMap<>();

	
	public static Map<Long,Message> getMessages(){
		return messagesMap;
	}
	
	public static void addMessage(Long id ,Message msg){
		messagesMap.put(id, msg);
		
	}
	public static Map<String,Profile> getProfiles(){
		return profilesMap;
	}

}
