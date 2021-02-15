package com.golden.jaxRSBasic.resources;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.golden.jaxRSBasic.model.Message;
import com.golden.jaxRSBasic.service.MessageService;

@Path("/messages")
public class MessageResource {
	
	
	MessageService service = new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessages() {
		return service.getMessages();
	}

}