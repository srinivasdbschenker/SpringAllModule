package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.nt.beans.Employee;
import com.nt.beans.Question;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Resource resource=new ClassPathResource("com/nt/cfgs/applicationContext.xml");
		
		BeanFactory factory=new XmlBeanFactory(resource);
		
		Employee emp=(Employee) factory.getBean("e");
		
		emp.show();
		System.out.println("----------collection constructor----------------");
		Question q=(Question) factory.getBean("q");
		
		q.displayInfo();
		System.out.println("answer ref...");
Question q1=(Question) factory.getBean("q1");
		
		q1.displayInfo();
		
		System.out.println("-------------map interface ---------------");
		Question q2=(Question) factory.getBean("q2");
		q2.displayMapInfo();
		
		
	}

}
