package com.nt.service;

import java.util.Random;

public class PinGenerator {
	
	public int generatePin(int cardNo){
		//generate ATM pin
		 Random rad=new Random();
		 
		 int pin=rad.nextInt(9999);
		 return pin;
	}

}
