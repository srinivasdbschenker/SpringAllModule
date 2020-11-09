package com.nt.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class BankDAOImpl implements BankDAO{

	private JdbcTemplate jt;
	
	private static final String WITHDRAW_QRY="update tx_account set balance=balance-? where accno=?";
	
	private static final String DEPOSITE_QRY="update tx_account set balance=balance+? where accno=?";
	
	
	
	
	public JdbcTemplate getJt() {
		return jt;
	}

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public int withdraw(int acno, int amt) {
		// TODO Auto-generated method stub
		
		int cnt=jt.update(WITHDRAW_QRY,amt,acno);
		return cnt;
	}

	@Override
	public int deposit(int acno, int amt) {
		// TODO Auto-generated method stub
		int cnt=jt.update(DEPOSITE_QRY,amt,acno);
		return 0;
	}

}
