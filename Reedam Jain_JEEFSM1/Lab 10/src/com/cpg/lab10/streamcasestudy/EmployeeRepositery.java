package com.cpg.lab10.streamcasestudy;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeRepositery {

	List<Employee> kl=new ArrayList<Employee>();
	
	List<Employee> read()
	{
		kl.add(new Employee(101,"Nandish","Kumar","nandish@gmail.com","9999999999","trainer",LocalDate.parse("2020-02-04"),
				10000.5, new Department(1,1001,"CSE")));
		
	
		//for(Employee e:kl)
			//System.out.println(e.departName);
		//kl.add(new Employee(
		return kl;
	}
	
	public static void main(String args[])
	{
		EmployeeRepositery obj=new EmployeeRepositery();
		List<Employee> list=obj.read();
		//obj.display();
		
		EmployeeService empService=new EmployeeService();
		
		empService.sumOfSalaryOfAllEmp(list);

		
	}

}
