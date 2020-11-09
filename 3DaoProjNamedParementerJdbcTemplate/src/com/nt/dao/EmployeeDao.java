package com.nt.dao;

import com.nt.bo.EmployeeBO;

public interface EmployeeDao {
	
	public String finaName(int empNo);
	public EmployeeBO findEmpDetails(int empNo);
	

}
