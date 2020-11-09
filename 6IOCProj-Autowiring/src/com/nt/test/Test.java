package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.TravelAgent;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		
		TravelAgent agent=null;
		factory=new DefaultListableBeanFactory();
		
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		
		
		agent=factory.getBean("agent",TravelAgent.class);
		System.out.println("agent "+agent);
		

	}

}
