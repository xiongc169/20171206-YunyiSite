package com.yunyi.web.jms;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

@Component
public class Producer {

	@Autowired
	private JmsTemplate jmsTemplate;

	/**
	 * 发送消息
	 * 
	 * @param destination
	 * @param message
	 */
	public void sendMessage(Destination destination, final String message) {

		jmsTemplate.send(destination, new MessageCreator() {
			public Message createMessage(Session session) throws JMSException {
				// TODO Auto-generated method stub
				return session.createTextMessage(message);
			}
		});
	}

}
