package com.nt.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nt.entity.Person;
import com.nt.repo.PersonDAO;

@Controller
public class PersonController {

	
	@Autowired
	private PersonDAO personDAO;

	
	private static final DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
	
	
	@ResponseBody
	@RequestMapping("/")
	public String index() {
		Iterable<Person> all=personDAO.findAll();
		System.out.println("terable: "+all);
		StringBuilder sb=new StringBuilder();
		all.forEach(p -> sb.append(p.getFullName()+ "<br>"));

		return sb.toString();
	}
	
	@ResponseBody
	@RequestMapping("/hi")
		public String hi() throws ParseException {
		Person p=new Person();
		p.setFullName("raja1");
		Date d=new Date();
		
		p.setDateOfBirth(df.parse("2020-01-02"));
		p.setId((long) 103);
		Person p1=new Person();
		p1.setId((long) 104);
		p1.setFullName("rani1");
		p1.setDateOfBirth(df.parse("2020-03-2"));
		
		personDAO.save(p);
		
		personDAO.save(p1);
		return "hi";
	}
		
}
