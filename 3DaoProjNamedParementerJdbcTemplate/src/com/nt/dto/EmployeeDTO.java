package com.nt.dto;

import java.io.Serializable;

public class EmployeeDTO implements Serializable {
	private int empNo;
	private String empName;
	private String empDesg;
	private double empSal;
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDesg() {
		return empDesg;
	}
	public void setEmpDesg(String empDesg) {
		this.empDesg = empDesg;
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	@Override
	public String toString() {
		return "EmployeeDTO [empNo=" + empNo + ", empName=" + empName
				+ ", empDesg=" + empDesg + ", empSal=" + empSal + "]";
	}
	
}
