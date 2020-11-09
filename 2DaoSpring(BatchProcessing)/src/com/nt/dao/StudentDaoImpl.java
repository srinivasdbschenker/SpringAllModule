package com.nt.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;

import com.nt.bo.StudentBO;

public class StudentDaoImpl implements StudentDao{
	
	private JdbcTemplate jt;
	private static final String INSERT_STUDENT_QUERY="INSERT INTO STUDENT VALUES(?,?,?)";
	

	public JdbcTemplate getJt() {
		return jt;
	}



	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}



	public int[] insert(List<StudentBO> list) {
		// TODO Auto-generated method stub
		int result[]=jt.batchUpdate(INSERT_STUDENT_QUERY,new StudentInsertBatchProcessor(list));
		return result;
	}
	
	private class StudentInsertBatchProcessor implements BatchPreparedStatementSetter{

		private List<StudentBO> lst;
		
		public StudentInsertBatchProcessor(List<StudentBO> lst) {
			// TODO Auto-generated constructor stub
			this.lst=lst;
		}

		public int getBatchSize() {
			// TODO Auto-generated method stub
			System.out.println("getBatchSizze()");
			return lst.size();
		}

		public void setValues(PreparedStatement ps, int index)
				throws SQLException {
			// TODO Auto-generated method stub
			
			System.out.println("set values ...");
			ps.setInt(1, lst.get(index).getSno());
			ps.setString(2, lst.get(index).getSname());
			ps.setString(3, lst.get(index).getSadd());
			
		}
		
	}

}
