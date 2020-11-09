package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.Flipkart;

public class LCTestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BeanFactory factory=new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
		
		Flipkart bean= (Flipkart) factory.getBean("fpk",Flipkart.class);
		
		//factory.getBean("fpk");
		
		String billmsg=bean.purchase(new String[]{"Shirt","mobile","books"});
		
		System.out.println(billmsg);
		

	}

}
