package com.nt.beans;


public class TravelAgent {
	
	private TourPlan tp;
	
	private String name;

	public TourPlan getTp() {
		return tp;
	}

	public void setTp(TourPlan tp) {
		this.tp = tp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public TravelAgent(){
		System.out.println("travel agent..");
	}

	@Override
	public String toString() {
		return "TravelAgent [tp=" + tp + ", name=" + name + "]";
	}
	
	
	

}
