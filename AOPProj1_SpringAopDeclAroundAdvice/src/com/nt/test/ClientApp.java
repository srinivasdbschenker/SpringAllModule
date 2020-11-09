package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.service.IntrAmtCalculator;

public class ClientApp {
	public static void main(String[] args){
		
		//create IOC Container
		
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		
		//get Bean
		IntrAmtCalculator proxy=ctx.getBean("pfb",IntrAmtCalculator.class);
		
		//class B.Method
		
		float intrAmt=proxy.calcInterAmt(800000, 2, 20);
		System.out.println("InterAmt="+intrAmt);
		System.out.println("------------------------");
		float intrAmt1=proxy.calcInterAmt(800000, 2, 20);
		System.out.println("InterAmt="+intrAmt1);
		System.out.println("------------------------");
		float intrAmt2=proxy.calcInterAmt(800000, 2, 20);
		System.out.println("InterAmt="+intrAmt2);
		
		
	}

}
