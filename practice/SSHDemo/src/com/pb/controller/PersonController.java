package com.pb.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pb.dao.PersonDao;
import com.pb.domain.PageBean;
import com.pb.domain.Person;

@Controller
public class PersonController {
	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	PersonDao persondao=(PersonDao) context.getBean("personDao");
	
	/*@RequestMapping(value="/login")
	public String login(Model model){	
		List<Person> list=persondao.PersonAll();
		System.out.println(list.size());
		 model.addAttribute("list", list);
		return "display";
		
	}	*/

//��ģ����ѯ�ķ�ҳ
	@RequestMapping(value="/login")
	public String login(Integer currentPage, String name,Model model){	
		System.out.println(currentPage);
		PageBean pagebean=null;
		
		if(currentPage!=null){
			 pagebean=persondao.getPageBean(10,currentPage,name);
		}else{
			 pagebean=persondao.getPageBean(10,1,name);
		}
	
		model.addAttribute("pagebean", pagebean);
		
		model.addAttribute("name", name);
		return "display";
		
	}	
	
//��ת���޸�ҳ��
	@RequestMapping(value="/editor")
	public String editor(@RequestParam(value="id") Integer id,Model model){
		Person person=persondao.findByid(id);
		model.addAttribute("person", person);
		return "editor";
	}

//�޸ĺ�����������޸ģ��޸���Ϻ���ת����ҳ
	@RequestMapping(value="/updateperson")
	public String updatepe(Person person){
		System.out.println(person.getBirthday());
		persondao.update(person);
		return "redirect:login";
	}
	
//ɾ������
	@RequestMapping(value="/delete")
	public String deleteperson(@RequestParam(value="id")Integer id){
		System.out.println(id);
		Person person=persondao.findByid(id);	
		persondao.delete(person);
		return "redirect:login";
	}

//��ת������ҳ��	
	@RequestMapping("/add")
	public String addPerson(){		
		return "add";
	}
	
	
//ִ���걣���˷������б����������������Ժ�ص���ҳ	
	@RequestMapping(value="/save")
	public String savePerson(Person person){
		persondao.save(person);
		 return "redirect:login";
	}
  
	@RequestMapping("/fuzzy")
	public String Fuzzy(String name,Integer age,Model model){
	//	List<Person> list=persondao.fuzzy(name, age);		
	//	model.addAttribute("list", list);
		
		return null;
	}
}