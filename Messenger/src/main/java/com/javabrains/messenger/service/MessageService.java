package com.javabrains.messenger.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import com.javabrains.messenger.database.DatabaseClass;
import com.javabrains.messenger.model.Message;

public class MessageService {
	
	private static Map<Long, Message> messagesMap= DatabaseClass.getMessages();
	
	public MessageService() {
		System.out.println("MessageService constructor called");
		messagesMap.put(1L, new Message(1,"Hello World 1","Sagar"));
		messagesMap.put(2L, new Message(2,"Hello World 2","Narotham"));
		messagesMap.put(3L, new Message(3,"Hello World 3","Raju"));
		messagesMap.put(4L, new Message(4,"Hello World 4","Balu"));
	}
	
	public List<Message> getAllMessages() {			
		System.out.println(messagesMap.values());
		return new ArrayList<Message>(messagesMap.values());
	}
	
	public List<Message> getAllMessagesforYear(int year) {
		List<Message> MessagesforYear = new ArrayList<>();
		Calendar cal = Calendar.getInstance();
		for (Message message : messagesMap.values()) {
			cal.setTime(message.getCreated());
			System.out.print(message+"   :  ");			
			System.out.print(cal.getTime());
			System.out.println();
			
			if (cal.get(Calendar.YEAR) == year) {
				MessagesforYear.add(message);
			}
		}				
		return MessagesforYear;
	}
	
	

	public List<Message> getAllMessagesPageNated(int start, int size) {
		List<Message> list = new ArrayList<>(messagesMap.values());
		//System.out.println("list size: "+list.size());		
		if (start+size > list.size()) return new ArrayList<Message>();		
		return list.subList(start-1, start+size-1);		
		
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
