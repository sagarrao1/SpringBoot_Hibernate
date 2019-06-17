package com.learning.Hibernate_Core;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//Get vs Load
public class App6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Configuration config= new Configuration().configure().addAnnotatedClass(Alien_table.class);		
		SessionFactory sf=config.buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		
		Alien_table a=null;
		
		//a= session.get(Alien_table.class, 5);
		//System.out.println(a);	
		
		Alien_table b=null;
		b= session.load(Alien_table.class, 5);
		System.out.println("load method");
		System.out.println(b);
		
		session.getTransaction().commit();
		
		
	}
}
