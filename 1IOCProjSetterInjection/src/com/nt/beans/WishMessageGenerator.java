package com.nt.beans;

import java.util.Date;


public class WishMessageGenerator {
	
	private Date date;
	
	static{
		System.out.println("WishMessage Generator:: static block");
	}
	
	public WishMessageGenerator(){
		System.out.println("Wish Message Generator:: 0-Param constructor");
	}
	
	public void setDate(Date date){
		System.out.println("wish messageGenerator:: setDate(-) ");
	     this.date =date;
	}

	public String generateWishMessage(String user){
		int hour=0;
		
		//hour=date.getHours();
		hour=22;
		//wrtie wissh message
		if(hour<=12)
			return "GM::"+user;
		else if(hour<=16)
			 return "Good After noon"+user;
		else if(hour<=20)
			 return "Good Evening"+user;
		else 
			return "Good Night"+user;
	}
	

}
