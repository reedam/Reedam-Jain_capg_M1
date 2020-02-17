package com.cpg.lab10.streamcasestudy;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmployeeService {

	public void sumOfSalaryOfAllEmp(List<Employee> list)
	{
		
		Optional<Double> result =list.stream().map(s->s.salary).reduce((a,b)->a+b);
		
		if(result.isPresent())
		{
			System.out.println(result.get());
		}
	}
	
	}
	
	
