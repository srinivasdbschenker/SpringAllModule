package com.nt.dao;

import java.util.List;
import java.util.Map;

public interface DBOperationsDAO {
	
	public int insert(int no, String name, String job, double sal);
	public int updateSalary(int no, double newSal);
	public double fetchSalary(int no);
	public Map<String,?> fetchEmpDetails(int no);
	public List<Map<String, Object>> fetchAllempDetails();
	public int delete(int no);

}
