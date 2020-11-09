package com.nt.beans;

public class BlueDart implements Courier {
	public BlueDart(){
		System.out.println("Blue Dart : 0 param constructor");
	}
	
	public String deliver(int orderid){
		return "BlueDart is ready to deliver product"+orderid;
	}

}
