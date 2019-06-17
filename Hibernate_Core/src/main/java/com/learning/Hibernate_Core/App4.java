package com.learning.Hibernate_Core;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//HQL queries usage 
public class App4 {

	public static void main(String[] args) {
		
		Alien_table at =null;
		
		Configuration config = new Configuration().configure().addAnnotatedClass(Alien_table.class);		
		SessionFactory sf = config.buildSessionFactory();
		
		
		Session session1 = sf.openSession();
		session1.beginTransaction();
		
		System.out.println("session 1 ................");
		
		int cut_off_marks=90;
		// Query with cache and prepared statement
		//Query q1=session1.createQuery("select sum(marks) from Alien_table where marks > "+cut_off_marks);
		Query q1=session1.createQuery("select sum(marks) from Alien_table where marks > :cut_off_marks");
		q1.setCacheable(true);
		q1.setParameter("cut_off_marks", cut_off_marks);
		Long msum = (Long) q1.uniqueResult();
		
		System.out.println(msum);
		
 				
		session1.getTransaction().commit();
		session1.close();
		

	}
}
