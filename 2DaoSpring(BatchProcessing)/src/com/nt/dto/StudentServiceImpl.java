package com.nt.dto;

import java.util.ArrayList;
import java.util.List;

import com.nt.bo.StudentBO;
import com.nt.dao.StudentDao;
import com.nt.dto.StudentDTO;
import com.nt.service.StudentService;

public class StudentServiceImpl implements StudentService{
	private StudentDao dao;
	

	public StudentDao getDao() {
		return dao;
	}


	public void setDao(StudentDao dao) {
		this.dao = dao;
	}


	public String registerStudents(List<StudentDTO> listDto) {
		// TODO Auto-generated method stub
		List<StudentBO> listBO=new ArrayList<StudentBO>();
		
		for(StudentDTO dto:listDto){
			StudentBO bo=new StudentBO();
			bo.setSno(dto.getSno());
			bo.setSname(dto.getSname());
			bo.setSadd(dto.getSadd());
			listBO.add(bo);
		}
		
		
		//use DAO Class
		
		int result[] =dao.insert(listBO);
		
		
		int sum=0;
		
		for(int i=0; i<result.length; ++i){
			sum=sum+result[i];
		}
		
		return sum+"no of records are inserted throught batch processing";
	}

}
