package com.cg.jdbcConDemo.ui;

import java.sql.Connection;

import com.cs.jdbcConDemo.dao.DBConnection;
import com.cs.jdbcConDemo.dao.EmployeeDaoService;
import com.cs.jdbcConDemo.dto.UserProfile;

public class EmployeeUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con=DBConnection.getConnection();
		System.out.println(con);
		UserProfile userBean=new UserProfile();
		userBean.setUserid(1);
		userBean.setFname("Ashish");
		userBean.setLname("Kumar");
		userBean.setAge(21);
		userBean.setSalary(3000);
		EmployeeDaoService empObj=new EmployeeDaoService();
		boolean result=empObj.employeeRegister(userBean);
		if(result)
		{
			System.out.println("Data Inserted");
		 }
		else {
			System.out.println("Data not Inserted");
		}

	}

}
