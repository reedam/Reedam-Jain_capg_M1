package com.cg.jdbcConDemo.service;

import com.cs.jdbcConDemo.dao.EmployeeDaoService;
import com.cs.jdbcConDemo.dto.UserProfile;

public class EmployeeService {
	EmployeeDaoService empobj=new EmployeeDaoService();
	public boolean employeeRegisterService(UserProfile empBean)
	{	
		if(empBean.getAge()>18){
			boolean result=empobj.employeeRegister(empBean);
		}
		else {
			return false;
		}
		return false ;
	}
}
