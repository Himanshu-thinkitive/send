package com.thinkitive;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Demo {

	public static void main(String[] args) {
			
	Configuration cfg=new Configuration();
		
		SessionFactory fact=cfg.configure().buildSessionFactory();
		Session session=fact.openSession();
		Transaction tr=session.beginTransaction();
		
		College c1=new College(12,"tit");
		
		
		
	
		
		
		Student e = new  Student(35, "MNO",c1);
		
		
		session.save(e);
		
		tr.commit();
		session.close();
		fact.close();

	}

}
