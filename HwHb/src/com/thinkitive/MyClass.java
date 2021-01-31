package com.thinkitive;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MyClass {
	private String name;
	private int id;
	private College college;
	public void insert(int id,String name,College college)
	{
		this.id=id;
		this.name=name;
		this.college=college;
		
		Configuration cfg=new Configuration();
		
		SessionFactory fact=cfg.configure().buildSessionFactory();
		Session session=fact.openSession();
		Transaction tr=session.beginTransaction();
		
//		Student s=new Student(id,name,college);
		
	//	session.save(s);
		tr.commit();
		session.close();
		fact.close();
		
		
	}
	
	public void show()
	{

		Configuration cfg=new Configuration();
		
		SessionFactory fact=cfg.configure().buildSessionFactory();
		Session session=fact.openSession();
		Transaction tr=session.beginTransaction();
		
		Query q=session.createQuery("From Student");
		List l=null;
		l=q.list();
		System.out.println(l);
		tr.commit();
		session.close();
		fact.close();
	}

}