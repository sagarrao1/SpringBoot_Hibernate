package com.javabrains.messenger.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.javabrains.messenger.model.Message;
import com.javabrains.messenger.service.MessageService;

@Path("/messages")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class MessageResource {
	
	MessageService msgService= new MessageService();
	
	@GET
	public List<Message> getMessages(@QueryParam("year") int year,
									@QueryParam("start") int start,
									@QueryParam("size") int size ) {
		if (year >0) {
			return msgService.getAllMessagesforYear(year);
		}	
		
		if (start >=0 && size >0) {
			return msgService.getAllMessagesPageNated(start, size);
		}
		return msgService.getAllMessages();		
	}
	
	@GET
	@Path("/{message_id}")	
	public Message getMessage(@PathParam("message_id") Long id) {
		return msgService.getMessage(id);
	}
	
	@POST
	public Message addMessage(Message msg) {
		return msgService.addMessage(msg);
	}
	
	@PUT
	@Path("/{message_id}")
	public Message updateMessage(@PathParam("message_id") Long id, Message msg) {
		msg.setId(id);
		return msgService.updateMessage(msg);
	}
	
	@DELETE
	@Path("/{message_id}")
	public void deleteMessage(@PathParam("message_id") Long id) {
		msgService.removeMessage(id);
	}

}
