package com.nt.init;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.context.annotation.Configuration;

import com.nt.entity.Person;
import com.nt.repo.PersonDAO;

//@Component
@Configuration
public class DataInit {
	
	private PersonDAO personDAO;
	
	private static final DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
	@Autowired
	public DataInit(){
		this.personDAO=personDAO;
	}

	public PersonDAO getPersonDAO() {
		return personDAO;
	}

	public void setPersonDAO(PersonDAO personDAO) {
		this.personDAO = personDAO;
	}
	
	public void run(ApplicationArguments args) throws Exception {
		
		long count=personDAO.count();
		
		if(count==0) {
			Person p1=new Person();
			p1.setFullName("raja1");
			Date d1=df.parse("2000-01-01");
			
			p1.setDateOfBirth(d1);
			
			
			Person p2=new Person();
			p2.setFullName("rani1");
			Date d2=df.parse("2000-01-02");
			p2.setDateOfBirth(d2);
			
			
			personDAO.save(p1);
			personDAO.save(p2);
			
		}
	}
}
