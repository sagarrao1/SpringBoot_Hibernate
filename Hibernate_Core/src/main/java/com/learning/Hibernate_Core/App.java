
package com.learning.Hibernate_Core;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Student s1 = new Student();
        s1.setId(102);
        s1.setName("Ravi");
        s1.setPoints(89);
        
        Configuration conf = new Configuration().configure().addAnnotatedClass(Student.class);
        SessionFactory sf = conf.buildSessionFactory();
        Session session = sf.openSession();        
        
        Transaction tx = session.beginTransaction();
        session.save(s1);
        tx.commit();
        
    }
}
