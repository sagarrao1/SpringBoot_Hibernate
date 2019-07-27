package com.javabrains.Hibernate3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.internal.SessionFactoryImpl;

import com.javabrains.Hibernate3.model.Employee;
import com.javabrains.Hibernate3.model.Vehicle;

public class EmployeTest {

	public static void main(String[] args) {
		
		Employee emp=  new Employee();
		emp.setEname("Sagar");
		
		Vehicle vehicle= new Vehicle();
		vehicle.setVehicleName("Brezza Car");
		
		emp.setVehicle(vehicle);
		
		SessionFactory sf= new Configuration().configure().buildSessionFactory();
		Session session= sf.openSession();
		Transaction tx= session.beginTransaction();
		session.save(emp);
		session.save(vehicle);		
		tx.commit();
		session.close();

	}

}
