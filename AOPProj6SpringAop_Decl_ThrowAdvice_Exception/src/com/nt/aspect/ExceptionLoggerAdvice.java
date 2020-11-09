package com.nt.aspect;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.aop.ThrowsAdvice;

public class ExceptionLoggerAdvice implements ThrowsAdvice{
	
	public void afterThrowing(IllegalArgumentException ie){
		throw new NumberFormatException("changed exception");
	}
	
	public void afterThrowing(Method method, Object args[], Object target, Throwable ie){
		System.out.println(ie.getClass()+"Exception is raised in "+method.getName()+" with args"+Arrays.toString(args)+" in "+target.getClass());
	}

}
