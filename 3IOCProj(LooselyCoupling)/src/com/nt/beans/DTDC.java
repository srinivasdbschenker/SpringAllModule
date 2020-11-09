package com.nt.beans;

public class DTDC implements Courier {
	public DTDC(){
		System.out.println("0- param Constructor...");
	}
	
	public String deliver(int orderid){
		return "DTDC is ready deliver products of "+orderid;
	}

}
