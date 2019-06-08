
package com.learning.Hibernate_Core;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Student s1 = new Student();
        s1.setId(103);
        s1.setName("bala");
        s1.setPoints(35);
        
        Configuration conf = new Configuration().configure().addAnnotatedClass(Student.class);
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(conf.getProperties()).buildServiceRegistry();
        SessionFactory sf = conf.buildSessionFactory(reg);
        Session session = sf.openSession();        
        
        Transaction tx = session.beginTransaction();
        session.save(s1);
        tx.commit();
        
    }
}
