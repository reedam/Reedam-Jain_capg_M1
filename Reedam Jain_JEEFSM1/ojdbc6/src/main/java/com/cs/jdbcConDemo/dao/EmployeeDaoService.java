package com.cs.jdbcConDemo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cs.jdbcConDemo.dto.UserProfile;
import com.cs.jdbcConDemo.dto.UserProfile;

public class EmployeeDaoService {
	Connection con=null;
	PreparedStatement psInsert;
	PreparedStatement psSelect;
	ResultSet result;
	public EmployeeDaoService()
	{
		con=DBConnection.getConnection();
	}
	
	public boolean employeeRegister(UserProfile empBean)
	{
		try {
		psInsert=con.prepareStatement("insert into User_Profile values(?,?,?,?,?)");
		psInsert.setInt(1, empBean.getUserid());
		psInsert.setString(2,empBean.getFname());
		psInsert.setString(3, empBean.getLname());
		psInsert.setInt(4, empBean.getAge());
		psInsert.setInt(5, empBean.getSalary());
		
		int result=psInsert.executeUpdate();
		if(result>0) {
			return true;
		}
		else
			return false;
	}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	public List<UserProfile> displayEmpDetailsDao(int age)
	{
		List<UserProfile> empList=new ArrayList<UserProfile>();
		try {
			psSelect=con.prepareStatement("select * from UserProfile where age>?");
			psSelect.setInt(15,age);
			result=psSelect.executeQuery();
			while(result.next())
			{
				UserProfile userBean=new UserProfile();
				userBean.setUserid(userBean.getUserid());
				empList.add(userBean);
				
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return empList;
	}
	
}
