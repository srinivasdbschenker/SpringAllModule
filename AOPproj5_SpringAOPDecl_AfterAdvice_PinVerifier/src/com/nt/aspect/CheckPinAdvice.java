package com.nt.aspect;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.aop.AfterReturningAdvice;

public class CheckPinAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object retValue, Method method, Object[] args,
			Object target) throws Throwable {
		// TODO Auto-generated method stub
		
		System.out.println("generated pin "+retValue);
		System.out.println("target class "+target.getClass());
		System.out.println("target method"+method.getName());
		System.out.println("target method args"+Arrays.toString(args));
		
		int cardNo=(Integer)args[0]+100;
		
		//get return value
		
		int pin=(Integer)retValue;
		
		//check the pin
		
		if(pin<=999)
			throw new IllegalArgumentException("Weak pin genearated");
		
		
		
		
	}

}
