package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.service.OrderApprover;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create IOC container
		
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		
		//get proxy
		OrderApprover proxy=ctx.getBean("orderApprover",OrderApprover.class);
		System.out.println("status:: "+proxy.approve(1001));

	}

}
