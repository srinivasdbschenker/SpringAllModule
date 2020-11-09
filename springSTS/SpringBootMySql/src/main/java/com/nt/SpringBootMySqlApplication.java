package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.nt.init.DataInit;

@SpringBootApplication
public class SpringBootMySqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMySqlApplication.class, args);
		DataInit d=new DataInit();
		//d.run(args);
		
	}

}
