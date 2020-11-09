package com.nt.aspect;

import com.nt.dao.AuthenticateDAO;


public class AuthenticationManager {
	
	private ThreadLocal<UserDetails> tl=new ThreadLocal<UserDetails>();
	
	private AuthenticateDAO dao;

	public AuthenticateDAO getDao() {
		return dao;
	}

	public void setDao(AuthenticateDAO dao) {
		this.dao = dao;
	}
	
	
	public void signIn(String user, String pwd){
		UserDetails ud=new UserDetails(user, pwd);
		tl.set(ud);
	}
	
	public void signOut(){
		tl.remove();
	}
	
	public boolean isAuthenticated(){
		//get userDetails obj
		
		UserDetails ud=tl.get();
		boolean flag=dao.authenticate(ud);
		return flag;
		
	}

	}
