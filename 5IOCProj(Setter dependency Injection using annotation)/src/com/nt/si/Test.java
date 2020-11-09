package com.nt.si;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@ComponentScan({com.nt.si,bean...})
public class Test {
	
	public static void main(String[] args){
		
		AnnotationConfigApplicationContext annotationContext=new AnnotationConfigApplicationContext();
		
		annotationContext.scan("com.nt.si");
		annotationContext.refresh();
		//Address address=annotationContext.getBean(Address.class);
		Address address=(Address) annotationContext.getBean(Address.class);
		
		Company company=(Company) annotationContext.getBean("company1");
		
		System.out.println("address object ::::: "+address.toString());
		System.out.println("company objec ::: "+company.toString());
	}

}
