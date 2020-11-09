package com.nt.service;

public class IntrAmtCalculator {
	
	public float calcInterAmt(float principle, float rate, float time){
		System.out.println("target class  : method");
		return (principle*rate*time)/100.0f;
	}

}
