package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.nt.bo.EmployeeBO;

public class EmployeeDaoImpl implements EmployeeDao {
	
	private NamedParameterJdbcTemplate npjt;
	private static final String GET_EMP_NAME_BY_NO="SELECT ENAME FROM EMP WHERE EMPNO=:no";
	private static final String GET_EMP_DETAILS_BY_NO="SELECT EMPNO, ENAME, JOB, SAL FROM EMP WHERE EMPNO=:no";
	
	
	
	

	public NamedParameterJdbcTemplate getNpjt() {
		return npjt;
	}

	public void setNpjt(NamedParameterJdbcTemplate npjt) {
		this.npjt = npjt;
	}

	public String finaName(int empNo) {
		// TODO Auto-generated method stub
		Map<String, Object> paramMap=new HashMap<String, Object>();
		paramMap.put("no", empNo);
		
		String name=npjt.queryForObject(GET_EMP_NAME_BY_NO, paramMap, String.class);
		
		return name;
	}

	public EmployeeBO findEmpDetails(int empNo) {
		// TODO Auto-generated method stub
		MapSqlParameterSource sqlMap=new MapSqlParameterSource();
		sqlMap.addValue("no", empNo);
		
		EmployeeBO ebo=npjt.queryForObject(GET_EMP_DETAILS_BY_NO, sqlMap, new EmployeeRowMapper());
		
		
		return ebo;
	}
	
	private static class EmployeeRowMapper implements RowMapper<EmployeeBO>{

		public EmployeeBO mapRow(ResultSet rs, int index) throws SQLException {
			// TODO Auto-generated method stub
			EmployeeBO bo=new EmployeeBO();
			bo.setEmpNo(rs.getInt(1));
			bo.setEmpName(rs.getString(2));
			bo.setEmpDesg(rs.getString(3));
			bo.setEmpSal(rs.getDouble(4));
			
			return bo;
		}
		
	}

}
