package com.jit;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryTest {

	public static void main(String[] args) {
		User user= new User();
		user.setFirstName("jitendra1");
		user.setAddress("nawali Jalaun1");
		user.setMiddleName("singh1");
		user.setLastName("parihar1");
		user.setPassword("jhjkhjk1");
		user.setUserType("manager1");
		
		
		Configuration cfg=new Configuration();
		
		cfg.configure();
		
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
	      session.save( user);
	
		
		session.getTransaction().commit();
		session.close();
		System.out.println("Completed");
		

	}

}
