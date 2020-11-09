package com.nt.beans;

import java.util.Arrays;

public class TourPlan {
	
	private String[] palces;
	
	public TourPlan(){
		System.out.println("Tour plan : 0 -arg constructor");
	}

	public String[] getPalces() {
		return palces;
	}

	public void setPalces(String[] palces) {
		this.palces = palces;
	}

	@Override
	public String toString() {
		return "TourPlan [palces=" + Arrays.toString(palces) + "]";
	}
	
	

}
