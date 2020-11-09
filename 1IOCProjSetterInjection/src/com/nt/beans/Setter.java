package com.nt.beans;

public class Setter {
	
	//generate getter and setter
	
	private int sno;
	private String sname;
	private double avg;
	
	public String toString() {
		return "Setter [sno=" + sno + ", sname=" + sname + ", avg=" + avg + "]";
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	
	

}
