package com.pb.common;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pb.dao.PersonDao;
import com.pb.domain.PageBean;
import com.pb.domain.Person;

public class junitTest {
	
@Test
public void tets(){
	
	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	PersonDao persondao=(PersonDao) context.getBean("personDao");
	List<Person> list=persondao.PersonAll();
	for(Person person:list){
		System.out.println(person.getName());
		}
	}

@Test
public void paging(){  	
	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	PersonDao persondao=(PersonDao) context.getBean("personDao");
	PageBean pagebean=persondao.getPageBean(5, 3,"g");
	int a=pagebean.getTotalPage();
	System.out.println(a);
	List<Person> list=pagebean.getList();
	 for(Person person:list){
		 System.out.println(person.getId()+person.getName());
	 }
	}

public void fuzzy(){
	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	PersonDao persondao=(PersonDao) context.getBean("personDao");
	
	/*List<Person> list=persondao.fuzzy("",70);
	for(Person person:list){
		System.out.println(person.getName()+person.getAge());
	}*/

}


public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	PersonDao persondao=(PersonDao) context.getBean("personDao");
		PageBean pb=persondao.getPageBean(5, 1, "p");
		List<Person> list=pb.getList();
	for(Person person:list){
		System.out.println(person.getName()+person.getAge());
	}
	
	
	}

}
