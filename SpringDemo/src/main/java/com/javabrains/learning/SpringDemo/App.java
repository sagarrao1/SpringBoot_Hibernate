package com.javabrains.learning.SpringDemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class App 
{
    public static void main( String[] args )
    {
        //Triangle t= new Triangle();
    	//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));    	
    	ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
    	//AbstractApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
    	//context.registerShutdownHook();
    	Triangle t =(Triangle) context.getBean("triangle");    	
        t.draw();
    }
}
