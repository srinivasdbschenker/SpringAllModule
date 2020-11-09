package com.nt.service;

import java.util.List;
import java.util.Map;

import com.nt.dao.DBOperationsDAO;

public class DBOperationsServiceImpl  implements DBOperationsService{
	
	private DBOperationsDAO dao;
	
	
	

	public DBOperationsDAO getDao() {
		return dao;
	}


	public void setDao(DBOperationsDAO dao) {
		this.dao = dao;
	}


	public String registerEmp(int no, String name, String job, double sal) {
		// TODO Auto-generated method stub
		
		int cnt=dao.insert(no, name, job, sal);
		if(cnt==0)
			return no+"employee registerd failed";
		else
			return no+"employee registerd succeded";
		
	}


	public String fireEmp(int no) {
		// TODO Auto-generated method stub
		
		int cnt=dao.delete(no);
		
		if(cnt==0)
			return no+" employee not deleted";
		else
		return no+" employee is  deleted..";
	}


	public double getSalary(int no) {
		// TODO Auto-generated method stub
		
		double sal=dao.fetchSalary(no);
		return sal;
	}


	public Map<String, Object> showEmpDetails(int no) {
		// TODO Auto-generated method stub
		
		Map<String, Object> map=(Map<String, Object>) dao.fetchEmpDetails(no);
		if(map!=null)
		return map;
		else
			return null;
	}


	public String hikeSalary(int no, int percentage) {
		// TODO Auto-generated method stub
		double sal=getSalary(no);
		System.out.println("sal "+sal);
		//double newSal=sal+(sal*(percentage/100));
		double newSal=sal+((sal*percentage)/100); 
		System.out.println("new sal "+newSal);
		int cnt=dao.updateSalary(no, newSal);
		if(cnt==0)
			return no+"emp salary is not hiked";
		else
		return no+"emp salary is hiked";
	}


	public List<Map<String, Object>> showAllEmpDetails() {
		// TODO Auto-generated method stub
		List<Map<String, Object>> emplist=dao.fetchAllempDetails();
		
		if(emplist !=null)
			return emplist;
		else
		return null;
	}

}
