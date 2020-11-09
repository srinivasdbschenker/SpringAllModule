package com.nt.service;

import java.util.List;
import java.util.Map;

public interface DBOperationsService {
	public String registerEmp(int no, String name, String job, double d);
	public String fireEmp(int no);
	public double getSalary(int no);
	public Map<String, Object> showEmpDetails(int no);
	public String hikeSalary(int no, int percentage);
	public List<Map<String, Object>> showAllEmpDetails();

}
