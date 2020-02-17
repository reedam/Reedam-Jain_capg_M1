package com.cpg.practicequestion.Streamapi;

import java.util.ArrayList;
import java.util.List;

public class Manager {
	
	public long calculateSalary(List<Employee> list)
	{
		//Employee emp;
		long i=list.stream().filter(emp->emp.getMgrname().equals("Nitin")).count();
		return i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee>  list=new ArrayList<Employee>();
		Employee obj1=new Employee(1,"Ashish",50000.0,"Nitin","CSE");
		Employee obj2=new Employee(2,"Ashish",25000.0,"Ashish","ECE");
		Employee obj3=new Employee(3,"Ashish",10000.0,"Nitin","Mech");
		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		Manager obj=new Manager();
		System.out.println(obj.calculateSalary(list));
	}

}
