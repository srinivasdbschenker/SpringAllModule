package com.nt.aspect;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LogAroundAdvice  implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		// TODO Auto-generated method stub
		
		System.out.println("enter into "+invocation.getMethod().getName()+" with args "+Arrays.toString(invocation.getArguments()));
		
		//Modify argument values
		 Object args[]=invocation.getArguments();
		 if(((Float)args[0])<50000){
			 args[1]=1.0f;
		 }
		 
		 Object retValue=null;
		 if(((Float)args[0])==0.0f || ((Float)args[1])==0.0f || ((Float)args[2])==0.0f){
			 return 0.0f;
		 }else{
			 retValue=invocation.proceed();
		 }
		 
		 System.out.println("Leaving from "+invocation.getMethod().getName()+" with args"+Arrays.toString(invocation.getArguments()));
		
		 if(((Float)retValue)<=25000)
		 return retValue;
		 else
			 return (((Float)retValue)+((Float)retValue)*0.1f);
	}

}
