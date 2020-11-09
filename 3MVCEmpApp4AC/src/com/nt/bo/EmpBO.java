package com.nt.bo;

public class EmpBO {

	private int no;
	private String name, job;
	private int salary;
	
	
	
	public EmpBO(int no, String name, String job, int salary) {
		super();
		this.no = no;
		this.name = name;
		this.job = job;
		this.salary = salary;
	}

	public EmpBO() {
		
		System.out.println("Emp bo 0 parameter constructor..");
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
