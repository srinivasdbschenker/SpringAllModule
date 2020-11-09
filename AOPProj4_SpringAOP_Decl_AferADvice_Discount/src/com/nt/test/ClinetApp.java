package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.service.ShoppingStore;

public class ClinetApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		
		//get proxy obj
		
		ShoppingStore proxy= ctx.getBean("pfb",ShoppingStore.class);
		//call target method
		
		float billAmt=proxy.calcBillAmt("table", 300, 20);
		System.out.println("Bill amoutn "+billAmt);
		

	}

}
