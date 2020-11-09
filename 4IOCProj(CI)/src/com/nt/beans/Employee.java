package com.nt.beans;

public class Employee {
	
	private int id;
	private String name;
	
	private Address address;
	
	public Employee(){
		System.out.println("default construction ...");
	}
	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address=address;
	}
	
	
	public void show(){
		System.out.println("id: "+id+ " name;: "+name);
		System.out.println(address.toString());
	}
	

}
