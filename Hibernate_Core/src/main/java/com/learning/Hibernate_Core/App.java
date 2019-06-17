
package com.learning.Hibernate_Core;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );        
		/*
		 * StudentName an= new StudentName(); an.setFname("Vidya sagar");
		 * an.setLname("Annamaneni"); an.setMname("Rao");
		 */          
		
        Laptop l1= new Laptop();        
        l1.setLid(1);
        l1.setLname("Dell");        
        
        Laptop l2= new Laptop();        
        l2.setLid(2);
        l2.setLname("Hp");
        
       
        Student s2 =  new Student();
		s2.setId(101);
		s2.setName("Sagar");
		s2.setPoints(95);
		s2.getLaptops().add(l1);
		s2.getLaptops().add(l2);
		
		Student s3 =  new Student();
		s3.setId(102);
		s3.setName("Ravi");
		s3.setPoints(15);
		s3.getLaptops().add(l1);
		s3.getLaptops().add(l2);
		
		
		l1.getStudents().add(s2);
		l1.getStudents().add(s3);
		
		l2.getStudents().add(s2);
		l2.getStudents().add(s3);
        
		
		
        Configuration conf = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
        //ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(conf.getProperties()).buildServiceRegistry();
        SessionFactory sf = conf.buildSessionFactory();
        Session session = sf.openSession();        
        
        Transaction tx = session.beginTransaction();
        
        session.save(s2);
        session.save(s3);
        //session.save(l1);
        //session.save(l2);
          
        //Persistent state of object
        s3.setPoints(60);
        
        //session.remove(s3);
//        s1= (Student) session.get(Student.class, 102);
        tx.commit();

        session.detach(s3);
        // we have used detach so it moved from persitance state to detached state
        s3.setPoints(15);

//        System.out.println(s1);
    }
}
