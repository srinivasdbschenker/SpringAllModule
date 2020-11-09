package com.nt.service;

import com.nt.dto.EmployeeDTO;

public interface EmployeeService {
	
	public String getEmpName(int empNo);
	public EmployeeDTO getEmpDetailsByNo(int empNo);
	

}
