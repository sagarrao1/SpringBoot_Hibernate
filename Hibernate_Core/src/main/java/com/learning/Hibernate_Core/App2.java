package com.learning.Hibernate_Core;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App2 {

	public static void main(String[] args) {

		/*
		 * Alien a1= new Alien(); a1.setAid(1); a1.setAname("Sagar"); a1.setMarks(76);
		 * 
		 * Alien a2= new Alien(); a2.setAid(2); a2.setAname("Ravi"); a2.setMarks(16);
		 * 
		 * Lapy l1=new Lapy(); l1.setLid(101); l1.setLname("Dell");
		 * 
		 * Lapy l2=new Lapy(); l2.setLid(102); l2.setLname("HP");
		 * 
		 * 
		 * Lapy l3=new Lapy(); l3.setLid(103); l3.setLname("Apple");
		 * 
		 * Lapy l4=new Lapy(); l4.setLid(104); l4.setLname("Acer");
		 * 
		 * Lapy l5=new Lapy(); l5.setLid(105); l5.setLname("IBM");
		 * 
		 * 
		 * a1.getLaps().add(l1); a1.getLaps().add(l3);
		 * 
		 * l1.setAlien(a1); l2.setAlien(a2); l3.setAlien(a1); l4.setAlien(a1);
		 * l5.setAlien(a1);
		 */

		Configuration config = new Configuration().configure().addAnnotatedClass(Alien.class)
				.addAnnotatedClass(Lapy.class);
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();

		Alien an1 =  (Alien) session.get(Alien.class, 1);
		System.out.println(an1.getAname());
		
//		List<Lapy> laps = an1.getLaps();		
//		for (Lapy lapy : laps) {
//			System.out.println(lapy);
//		}
		
		/*
		 * session.save(a1); session.save(a2); session.save(l1); session.save(l2);
		 * session.save(l3); session.save(l4); session.save(l5);
		 */
		session.getTransaction().commit();

	}

}
