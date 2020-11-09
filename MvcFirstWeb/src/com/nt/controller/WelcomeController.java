package com.nt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;


public class WelcomeController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest req,HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		
		ModelAndView mav=new ModelAndView();
		
		mav.addObject("msg", "Welcome to Spring MVC2");
		return mav;
	}

}
