package com.nt.beans;

import java.util.Random;

public class Flipkart {
	private Courier courier;
	
	public Flipkart(){
		System.out.println("0- parma ordierid ..");
	}

	public void setCourier(Courier courier){
		System.out.println("Flip kart : set clourier..");
		this.courier=courier;
	}
	
	public String purchase(String[] items){
		Random rad=new Random();
		int orderid=rad.nextInt(700000);
		
		String status=courier.deliver(orderid);
		return status+"blill ammt for orederid "+orderid+" is 7000";
	}
}
