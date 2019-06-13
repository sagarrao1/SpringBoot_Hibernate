package com.learning.Hibernate_Core;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App3 {

	public static void main(String[] args) {
		
		/*
		 * Alien_table a1 = new Alien_table(); a1.setAid(1); a1.setAname("Sagar");
		 * a1.setMarks(76);
		 * 
		 * Alien_table a2 = new Alien_table(); a2.setAid(2); a2.setAname("Ravi");
		 * a2.setMarks(16);
		 */		
		
		Configuration config = new Configuration().configure().addAnnotatedClass(Alien_table.class);		
		SessionFactory sf = config.buildSessionFactory();
		
		System.out.println("session 1 ................");
		Session session1 = sf.openSession();
		session1.beginTransaction();
		
		Alien_table an1 = (Alien_table) session1.get(Alien_table.class, 1);
		System.out.println(an1);
		
		session1.getTransaction().commit();
		session1.close();
		
		System.out.println("session 2 ................");
		Session session2 = sf.openSession();
		session2.beginTransaction();
		
		an1 =  (Alien_table) session2.get(Alien_table.class, 1);
		System.out.println(an1);
		
		session2.getTransaction().commit();
		session2.close();

	}
}
