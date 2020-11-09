package com.nt.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.nt.aspect.UserDetails;

public class AuthenticateDAO {
	
private static final String AUTH_QRY="select count(*) from userlist where uname=? and pwd=?";
	
	private JdbcTemplate jt;

	public JdbcTemplate getJt() {
		return jt;
	}

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}
	
	
	public boolean authenticate(UserDetails ud){
		int cnt=jt.queryForInt(AUTH_QRY,ud.getUser(),ud.getPwd());
		
		if(cnt==0)
			return false;
		else
			return true;
		
	}


}
