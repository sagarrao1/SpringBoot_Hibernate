package com.javabrains.learning.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		//AbstractApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		//context.registerShutdownHook();
		ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		Shape shape= (Shape) context.getBean("circle");
		shape.draw();
		//System.out.println(context.getMessage("greeting", null, "default greeting", null));

	}

}
