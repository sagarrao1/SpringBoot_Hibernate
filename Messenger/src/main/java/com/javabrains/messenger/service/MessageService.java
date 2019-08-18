package com.javabrains.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.javabrains.messenger.database.DatabaseClass;
import com.javabrains.messenger.model.Message;

public class MessageService {
	
	private static Map<Long, Message> messagesMap= DatabaseClass.getMessages();
	
	
	public List<Message> getAllMessages() {			
		System.out.println(messagesMap.values());
		return new ArrayList<Message>(messagesMap.values());
	}
	
	public Message getMessage(Long id) {			
		return messagesMap.get(id);
	}
	
	public Message addMessage(Message msg) {
		msg.setId(messagesMap.size()+1);
		messagesMap.put(msg.getId(), msg);
		return msg;		
	}

	public Message updateMessage(Message msg) {
		if (msg.getId() <=0) {
			return null;
		} else {
			messagesMap.put(msg.getId(), msg);
			return msg;
		}
	}
	
	public Message removeMessage(Long id) {
		return messagesMap.remove(id);
		
	}
}
