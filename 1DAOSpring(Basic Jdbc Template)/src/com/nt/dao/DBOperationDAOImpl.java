package com.nt.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class DBOperationDAOImpl  implements DBOperationsDAO{
	
	private JdbcTemplate jt;
	
	//querypart 
	private static final String INSERT_EMP_QUERY="INSERT INTO EMP(EMPNO, ENAME, JOB, SAL)VALUES(?,?,?,?)";
	private static final String DELETE_EMP_BY_EMPNO="DELETE FROM EMP WHERE EMPNO=?";
	private static final String GET_SALARY_BY_EMPNO_QUERY="SELECT SAL FROM EMP WHERE EMPNO=?";
	private static final String GET_EMP_DETAILS_BY_NO="SELECT EMPNO, ENAME, SAL, JOB FROM EMP WHERE EMPNO=?";
	private static final String UPDATE_EMP_SALARY_BY_EMPNO_QUERY="UPDATE EMP SET SAL=? WHERE EMPNO=?";
	private static final String GET_ALL_EMP_DETAILS="SELECT EMPNO , ENAME, SAL, JOB FROM EMP";

	public JdbcTemplate getJt() {
		return jt;
	}

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	public int insert(int no, String name, String job, double salary) {
		// TODO Auto-generated method stub
		int count=jt.update(INSERT_EMP_QUERY,no,name, job, salary);
		return count;
	}

	public int updateSalary(int no, double newSalary) {
		// TODO Auto-generated method stub
		int count =jt.update(UPDATE_EMP_SALARY_BY_EMPNO_QUERY, newSalary,no);
		System.out.println("count :: "+count);
		
		return count;
	}

	public double fetchSalary(int no) {
		// TODO Auto-generated method stub
		
		double sal=jt.queryForObject(GET_SALARY_BY_EMPNO_QUERY, Double.class, no);
		
		return sal;
	}

	public Map<String, ?> fetchEmpDetails(int no) {
		// TODO Auto-generated method stub
		Map<String, Object> map=jt.queryForMap(GET_EMP_DETAILS_BY_NO,no);
		
		
		return map;
	}

	public List<Map<String, Object>> fetchAllempDetails() {
		// TODO Auto-generated method stub
		List<Map<String, Object>> list=jt.queryForList(GET_ALL_EMP_DETAILS,new Object[]{});
		
		return list;
	}

	public int delete(int no) {
		// TODO Auto-generated method stub
		int count=jt.update(DELETE_EMP_BY_EMPNO,no);
		System.out.println("cout :: "+count);
		
		return count;
	}

}
