package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.service.PriceCalculator;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create IOCcontainer
		
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		
		//get proxy object
		
		PriceCalculator proxy=ctx.getBean("pfb", PriceCalculator.class);
		try{
		float price=proxy.calcPrice(45.66f, 0);
		System.out.println("Price= "+price);
		}catch(Exception ie){
			System.out.println("Internal problem "+ie.getClass()+" "+ie.getMessage());
		}
		
	}

}
