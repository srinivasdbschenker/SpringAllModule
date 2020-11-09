package com.nt.dao;

import java.util.List;

import com.nt.bo.StudentBO;

public interface StudentDao {
	public int[] insert(List<StudentBO> list);

}
