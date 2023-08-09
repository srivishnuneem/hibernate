package com.demo.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Project started...");
		
		Configuration cfg = new Configuration();
		cfg.configure("index.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		
		Student_Info student = new Student_Info();
		
		student.setName("kowsalya");
		student.setRollNo(3);
		System.out.println(student);
		
		Session session = sessionFactory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.save(student);
		
		tx.commit();
		
		session.close();
		


		
	}

}
