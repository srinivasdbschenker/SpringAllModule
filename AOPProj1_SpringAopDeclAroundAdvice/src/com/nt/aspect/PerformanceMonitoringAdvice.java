package com.nt.aspect;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class PerformanceMonitoringAdvice implements MethodInterceptor {
	
	long start, end;

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		// TODO Auto-generated method stub
		start= System.currentTimeMillis();
		Object retValue=invocation.proceed();
		end=System.currentTimeMillis();
		System.out.println("Invocation-> "+invocation.getMethod().getName()+" has taken "+(end-start)+"to complete exectuion");
		return retValue;
	}

}
