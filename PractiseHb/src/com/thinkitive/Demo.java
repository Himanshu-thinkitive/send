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
		
		College c1=new College(121,"tit");
		College c2=new College(131,"lnct");
		College c3=new College(141,"oriental");
		
		List <College>l=new ArrayList<College>();
		l.add(c1);
		l.add(c2);
		l.add(c3);
		
		Student e = new  Student(53, "himanshu",l);
		
		
		session.save(e);
		
		tr.commit();
		session.close();
		fact.close();

	}

}
