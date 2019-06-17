package com.learning.Hibernate_Core;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import net.sf.ehcache.search.expression.Criteria;

//Native SQL queries usage 
public class App5 {

	public static void main(String[] args) {
		
		Alien_table at =null;
		
		Configuration config = new Configuration().configure().addAnnotatedClass(Alien_table.class);		
		SessionFactory sf = config.buildSessionFactory();
		
		
		Session session1 = sf.openSession();
		session1.beginTransaction();
		
		System.out.println("session 1 ................");
		
		int cut_off_marks=90;;
		// SQL Query with cache and prepared statement
		
		List<Alien_table> emps =  session1.createNativeQuery("select * from Alien_table where marks > 90", Alien_table.class).getResultList();
		//query.addEntity(Alien_table.class);
		//query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
		
		
		for (Alien_table atb : emps) {
			System.out.println("ID : "+atb.getAid()+"\tName: "+atb.getAname()+"\tMarks: "+atb.getMarks());
		}
		
		System.out.println("Another way of fecting.......................");
		
		List<Object[]> emp = session1.createNativeQuery("select aname,marks from Alien_table where marks > 90").list();
		
		
		for (Object[] att : emp) {
			System.out.println(att[0]+" : "+att[1]);
		}
		
		
		
		
		
 				
		session1.getTransaction().commit();
		session1.close();
		

	}
}
