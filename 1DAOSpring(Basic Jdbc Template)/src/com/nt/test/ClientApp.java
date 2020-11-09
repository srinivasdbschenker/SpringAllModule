package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.service.DBOperationsService;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		
		DBOperationsService service=context.getBean("dbService",DBOperationsService.class );
		//System.out.println("7499 emp salary (before hike):: "+service.getSalary());
		
		System.out.println("insert values ...");

		//service.registerEmp(102, "rani", "sse",155.34);
		System.out.println("inserted....");
		
		System.out.println("fire emp ");
		//service.fireEmp(102);
		
		System.out.println("fetch salary ...");
		System.out.println(service.getSalary(102));
		System.out.println("show empdetails using map .##################..");
		System.out.println(service.showEmpDetails(102));
		System.out.println("$$$$$$$$$$$$$$$$$update salary");
		System.out.println(service.hikeSalary(102, 40));
		System.out.println("*****************list all employee***************");
		System.out.println(service.showAllEmpDetails());
		
	}

}
