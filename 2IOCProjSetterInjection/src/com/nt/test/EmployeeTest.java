package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.nt.Employee;


public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Resource resource=new ClassPathResource("com/nt/cfgs/applicationContext.xml");
		
		BeanFactory factory=new XmlBeanFactory(resource);
		
		Employee employee=(Employee) factory.getBean("obj");

		Employee employee1=(Employee) factory.getBean("obj1");
		
		//employee.toString();
		System.out.println(employee.toString());
		employee.display();
		System.out.println("------------------------------");
		System.out.println(employee1.toString());
		employee1.display();
		

	}

}
