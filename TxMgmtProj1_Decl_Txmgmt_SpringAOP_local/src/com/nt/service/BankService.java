package com.nt.service;

import com.nt.dao.BankDAO;

public class BankService {
	
	private BankDAO dao;

	public BankDAO getDao() {
		return dao;
	}

	public void setDao(BankDAO dao) {
		this.dao = dao;
	}
	
	public boolean transferMoney(int srcNo, int destNo, int amt){
		int result1=dao.withdraw(srcNo, amt);
		int result2=dao.deposit(destNo, amt);
		
		if(result1==0 || result2==0){
			throw new RuntimeException("Money not Transfered(Tx rooled back)");
			
		}else{
			System.out.println("Money Trasnsfered (TX commited");
			return true;
		}
	}

}
