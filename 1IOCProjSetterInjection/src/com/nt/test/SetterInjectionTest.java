package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishMessageGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Resource res=null;
		BeanFactory factory=null;
		
		WishMessageGenerator wish=null, wish1=null;
	//res=new FileSystemResource("src/com/nt/cfg/applicationContext.xml");	
 res=new ClassPathResource("com/nt/cfg/applicationContext.xml");
 factory=new XmlBeanFactory(res);
 
 wish=(WishMessageGenerator) factory.getBean("wish");
 System.out.println("------------------------------------");
wish1=(WishMessageGenerator) factory.getBean("wish1");
 System.out.println("wish address "+wish.hashCode()+"........wish1address..."+wish1.hashCode());
 System.out.println("wish message"+wish.generateWishMessage("raja"));
 
 
 
	}

}
