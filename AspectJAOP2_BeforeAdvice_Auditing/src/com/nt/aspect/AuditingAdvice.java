package com.nt.aspect;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

import org.aspectj.lang.JoinPoint;

public class AuditingAdvice {
	
	public void audit(JoinPoint jp, int oid) throws IOException{
		System.out.println("target method :: "+jp.getSignature());
		System.out.println("target method:: "+jp.getTarget().getClass());
		
		System.out.println("Order id is "+oid);
		
		Object args[]=jp.getArgs();
		
		args[0]=(Integer)args[0]+1;
		
		jp.getArgs()[0]=args[0];
		
		//perform auditing
		
		FileWriter fw=new FileWriter("audit.log",true);
		
		fw.write("order with orderid "+oid+" sumited for approval on date "+new Date());
		fw.flush();fw.close();
		
	}

}
