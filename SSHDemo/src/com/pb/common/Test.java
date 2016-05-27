package com.pb.common;

import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.pb.domain.Person;

public class Test {

	public static void main(String[] args) {
		Session session=null;
		try {
		    session=HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			
			for(int i=1;i<=50;i++){
				Person person=new Person();
				person.setName("person"+i);
				person.setAge(22+i);
				person.setEmail("person"+i+"@126.com");
				person.setBirthday(new Date());
				session.save(person);			
				
			}
			
			
			session.getTransaction().commit();
			
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			session.getTransaction().rollback();
			e.printStackTrace();
		}finally{
			session.close();
		}
		
		
	}

}
