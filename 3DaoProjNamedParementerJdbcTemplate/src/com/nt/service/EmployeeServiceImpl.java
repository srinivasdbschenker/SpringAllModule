package com.nt.service;

import com.nt.bo.EmployeeBO;
import com.nt.dao.EmployeeDao;
import com.nt.dto.EmployeeDTO;

public class EmployeeServiceImpl  implements EmployeeService{
	
	private EmployeeDao dao;
	
	

	public EmployeeDao getDao() {
		return dao;
	}

	public void setDao(EmployeeDao dao) {
		this.dao = dao;
	}

	public String getEmpName(int empNo) {
		// TODO Auto-generated method stub
		String name=dao.finaName(empNo);
		return name;
	}

	public EmployeeDTO getEmpDetailsByNo(int empNo) {
		// TODO Auto-generated method stub
		EmployeeBO bo=dao.findEmpDetails(empNo);
		
		EmployeeDTO dto=new EmployeeDTO();
		dto.setEmpNo(bo.getEmpNo());
		dto.setEmpName(bo.getEmpName());
		dto.setEmpDesg(bo.getEmpDesg());
		dto.setEmpSal(bo.getEmpSal());
		
		return dto;
	}

}
