package com.nt;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	int eno;
	int ename;
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public int getEname() {
		return ename;
	}
	public void setEname(int ename) {
		this.ename = ename;
	}
	

}
