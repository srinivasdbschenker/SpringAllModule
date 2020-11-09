package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.service.PinGenerator;

public class ClientApp {
	
	public static void main(String[] args){
		
		//crate IOC Container
		
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		
		//get proxy obj
		
		PinGenerator proxy=ctx.getBean("pfb", PinGenerator.class);
		//call target method
		
		
		int pin=proxy.generatePin(888888);
		System.out.println("Genrated pin::"+pin);
		
	}

}
