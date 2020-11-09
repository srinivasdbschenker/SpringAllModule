package com.nt.service;

import java.util.Calendar;

public class OrderApprover {

	public String approve(int orderid){
		//get current month
		
		Calendar cl=Calendar.getInstance();
		int h=cl.get(Calendar.MONTH);
		//int h=7;
		if(h>7 && h<10)
			return "we do not accept this "+orderid+" order in rainy season";
		else
			return orderid+" order is approved";
	}
}
