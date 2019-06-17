package com.learning.JPA_Demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Alien_table at = new Alien_table();
        at.setAid(101);
        at.setAname("JPA testing user");
        at.setMarks(96);
        
        EntityManagerFactory emf =  Persistence.createEntityManagerFactory("pu");
        EntityManager em= emf.createEntityManager();
        
        Alien_table a = em.find(Alien_table.class, 4);
        System.out.println(a);
        
        em.getTransaction().begin();
        
        em.persist(at);
        
        em.getTransaction().commit();
    }
}
