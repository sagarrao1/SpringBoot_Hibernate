package com.javabrains.Hibernate3;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.javabrains.Hibernate3.model.*;


public class HibernateTest {

	public static void main(String[] args) {
		UserDetails user= new UserDetails();
		//user.setUserId(1);
		user.setUserName("Sagar");
		user.setJoinedDate(new Date());
		//user.setAddress("sagar address");;
		user.setDescription("sagar description");
		
/*		UserDetails user2= new UserDetails();
		//user2.setUserId(1);
		user2.setUserName("Second user");
		user2.setJoinedDate(new Date());
		//user2.setAddress("second user address");;
		user2.setDescription("second userdescription");
*/		

		Address addr= new Address();
		addr.setStreet("Bandari layout");
		addr.setCity("Hyderabad");
		addr.setState("Telangana");
		addr.setPincode("500090");
		
		Address addr2= new Address();
		addr2.setStreet("second street");
		addr2.setCity("second city");
		addr2.setState("second state");
		addr2.setPincode("second 500090");
		
		user.getListOfaddresses().add(addr);
		user.getListOfaddresses().add(addr2);
//		
//		user.setHome_address(addr);
//		user.setOffice_address(addr2);
		
		SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();		
		session.save(user);		
		tx.commit();
		session.close();
		
		user=null;
		session= sessionFactory.openSession();
		session.beginTransaction();
		user = session.get(UserDetails.class, 1);
		System.out.println(user.getUserId()+": "+ user.getUserName()+": "+user.getJoinedDate());
		session.close();
		System.out.println(user.getListOfaddresses().size());
		
	}
	
}
