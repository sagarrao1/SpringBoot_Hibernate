package com.learning.Hibernate_Core;

import java.util.List;
import java.util.Random;

import org.hibernate.Query;
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
		Alien_table at =new Alien_table();
		
		Configuration config = new Configuration().configure().addAnnotatedClass(Alien_table.class);		
		SessionFactory sf = config.buildSessionFactory();
		
		
		Session session1 = sf.openSession();
		session1.beginTransaction();
		
		System.out.println("session 1 ................");
		
		/*
		 * Random r= new Random();
		 * 
		 * for (int i = 3; i < 100; i++) { Alien_table t = new Alien_table();
		 * t.setAid(i); t.setAname("Sagar "+i); t.setMarks(r.nextInt(100));
		 * session1.save(t); }
		 */		

		// Query with cache Query q1=
		Query q1=session1.createQuery("select aid ,aname,marks from Alien_table where marks>80");
		q1.setCacheable(true);
		List<Object[]> students = q1.list();

		// at= (Alien_table) q1.uniqueResult(); //Alien_table at = (Alien_table)
		session1.get(Alien_table.class, 1);
		for (Object[] objects : students) {
			System.out.println(objects[0] + " : " + objects[1] + " : " + objects[2]);
		}
 				
		session1.getTransaction().commit();
		session1.close();
		
		System.out.println("session 2 ................");
		Session session2 = sf.openSession();
		session2.beginTransaction();
		
		//Query with cache
		Query q2= session2.createQuery("select aid ,aname,marks from Alien_table where aid=2");
		q2.setCacheable(true);
		Object[] std= (Object[]) q2.uniqueResult();	
		System.out.println(std[0]+" : "+std[1]+" : "+std[2]);
				
		//at =  (Alien_table) session2.get(Alien_table.class, 1);
		//System.out.println(at);
		
		session2.getTransaction().commit();
		session2.close();

	}
}
