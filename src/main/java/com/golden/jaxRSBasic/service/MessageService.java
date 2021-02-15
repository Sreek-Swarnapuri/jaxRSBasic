package com.golden.jaxRSBasic.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import com.golden.jaxRSBasic.model.Message;

public class MessageService {

	public List<Message> getMessages() {
		List<Message> messages = new ArrayList<>();
		
		messages.add(new Message(1, "Test", new Date(), "Test 1"));
		messages.add(new Message(2, "Test2", new Date(), "Test 2"));
		messages.add(new Message(3, "Test3", new Date(), "Test 3"));
		
		return messages;
	}

}
