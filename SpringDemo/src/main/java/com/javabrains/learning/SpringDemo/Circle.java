package com.javabrains.learning.SpringDemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Service
@Component
public class Circle implements Shape, ApplicationEventPublisherAware {
	
	private Point center;
	@Autowired
	private MessageSource messageSource;
	private ApplicationEventPublisher publisher;
	
	

	public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	public void draw() {
		System.out.println("circle draw method");
		//System.out.println(messageSource.getMessage("circle.draw", null,"default message",null));
		//System.out.println(messageSource.getMessage("circle.draw2", new Object[] {center.getX(),center.getY()},"default message",null));
		DrawEvent drawEvent= new DrawEvent(this);		
		publisher.publishEvent(drawEvent);
	}

	public Point getCenter() {
		return center;
	}

	@Resource(name = "pointA")
	public void setCenter(Point center) {
		this.center = center;
	}
	
	@PostConstruct
	public void initializeCircle() {
		System.out.println("Initialize my circle");
	}

	@PreDestroy
	public void destroyCircle() {
		System.out.println("destroy my circle");
	}

	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher= publisher;		
	} 	
}
