package com.nt.dao;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.nt.bo.Employee;

public class EmployeeDao {
HibernateTemplate template;

public HibernateTemplate getTemplate() {
	return template;
}

public void setTemplate(HibernateTemplate template) {
	this.template = template;
}

public void saveEmployee(Employee e){
	template.save(e);
}
	
}
