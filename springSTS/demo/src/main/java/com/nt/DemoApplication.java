package com.nt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.nt"})
@SpringBootApplication
public class DemoApplication {
	
  
	     
	public static void main(String[] args) {
	ApplicationContext applicationContext=	SpringApplication.run(DemoApplication.class, args);
		
		Employee emp=new Employee();
		emp.setEno(101);
		System.out.println("eno : "+emp.getEno());
		
		for(String name: applicationContext.getBeanDefinitionNames()) {
			System.out.println("spring application context names"+name);
		}
	}

}
