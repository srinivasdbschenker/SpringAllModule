package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.service.EmployeeService;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		
		EmployeeService service=context.getBean("empService", EmployeeService.class);
		
     System.out.println("empname:: "+service.getEmpName(101));
     System.out.println("---------------------------------------");
     
     System.out.println("empDetails :: "+service.getEmpDetailsByNo(101));
	}

}
