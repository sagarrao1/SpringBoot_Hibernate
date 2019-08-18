package com.javabrains.messenger.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.javabrains.messenger.model.Message;
import com.javabrains.messenger.service.MessageService;

@Path("messages")
public class MessageResource {
	
	MessageService msgService= new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessages() {		
		return msgService.getAllMessages();		
	}

}
