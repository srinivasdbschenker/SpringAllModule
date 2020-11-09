package com.nt.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.dto.StudentDTO;
import com.nt.service.StudentService;

public class ClinetApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		
		StudentService service=ctx.getBean("stService",StudentService.class);
		
		StudentDTO st1=new StudentDTO();
		
		st1.setSno(101);
		st1.setSname("raja");
		st1.setSadd("hyd");
		
		StudentDTO st2=new StudentDTO();
		st2.setSno(102);
		st2.setSname("rani");
		st2.setSadd("vizaq");

		List<StudentDTO> listDto=new ArrayList<StudentDTO>();
		
		listDto.add(st1);
		listDto.add(st2);
		
		System.out.println(service.registerStudents(listDto));
		
	}

}
