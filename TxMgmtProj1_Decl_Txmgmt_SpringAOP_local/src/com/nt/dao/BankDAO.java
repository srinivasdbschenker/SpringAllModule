package com.nt.dao;

public interface BankDAO {
	public int withdraw(int acno, int amt);
	public int deposit(int acno, int amt);
	

}
