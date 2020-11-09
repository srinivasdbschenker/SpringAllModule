package com.nt.controller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class WishController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req,
			HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		Calendar cl=Calendar.getInstance();
		
		int hour=cl.get(Calendar.HOUR_OF_DAY);
		
		String msg=null;
		
		if(hour<12)
			msg="Good Morning";
		else if(hour<16)
			msg="Good Afternoon";
		else if(hour<20)
			msg="Good Evening";
		else
			msg="Good Evening";
		
		
		
		
		return new ModelAndView("result" , "wmsg",msg);
	}

}
