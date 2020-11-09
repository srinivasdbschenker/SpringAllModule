package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.nt.bo.Employee;
import com.nt.dao.EmployeeDao;

public class InsertTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Resource r=new ClassPathResource("com/nt/cfgs/applicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(r);
		//ApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		EmployeeDao dao=(EmployeeDao) factory.getBean("d",EmployeeDao.class);
		
Employee e=new Employee();
e.setId(101);
e.setName("raja");
e.setSalary(10000000);

dao.saveEmployee(e);
	}

}
