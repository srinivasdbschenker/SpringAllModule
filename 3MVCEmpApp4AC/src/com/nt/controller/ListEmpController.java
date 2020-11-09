package com.nt.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.nt.dto.EmpDTO;
import com.nt.service.ListEmpService;

public class ListEmpController  extends AbstractController{
	
	private ListEmpService listEmpService;
	

	public ListEmpService getListEmpService() {
		return listEmpService;
	}


	public void setListEmpService(ListEmpService listEmpService) {
		this.listEmpService = listEmpService;
	}


	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req,
			HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		
		List<EmpDTO> listEmpDTO=listEmpService.getAllEmps();
		
		
		return new ModelAndView("listEmps","empList",listEmpDTO);
	}

}
