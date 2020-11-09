package com.nt.aspect;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class SecurityAdvice implements  MethodBeforeAdvice{
	
	private AuthenticationManager am;
	

	public void setAm(AuthenticationManager am) {
		this.am = am;
	}


	@Override
	public void before(Method method, Object[] args, Object target)
			throws Throwable {
		// TODO Auto-generated method stub
		
		//perform authentication
		
		boolean flag=am.isAuthenticated();
		
		if(flag==false)
			throw new IllegalArgumentException("In valid Credentials");
		
	}

}
