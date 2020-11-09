package com.nt.aspect;

import java.io.FileWriter;
import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class DiscountCuponAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object returnvalue, Method mthod, Object[] args,
			Object target) throws Throwable {
		// TODO Auto-generated method stub
		
		float billAmt=(float) returnvalue;
		
		//we can not modify return value
		
		billAmt=billAmt+100;
		returnvalue =billAmt;
		
		String msg=null;
		
		if(billAmt>=50000)
			msg="Avail 30% discount on next purchase";
		else
			 msg="Avail 10% discount on next purchase";
		
		//Store docuount cupon in a file
		
		FileWriter fw=new FileWriter("cupon.Tt");
		fw.write(msg);
		fw.flush();fw.close();
		
	}

}
