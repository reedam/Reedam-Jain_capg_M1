package com.cpg.practicequestion.Streamapi;

import java.util.ArrayList;
import java.util.List;

class EmployeeImplementation{
	public Employee calculateSalary(List<Employee> list)
	{
		
		Employee emp2 = list
		    .stream()
		    .max((p1, p2) -> Double.compare(p1.getSalary(), p2.getSalary()))
		    .get();
		return emp2;
	}
}

public class EmployeeHighestSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee>  list=new ArrayList<Employee>();
		Employee obj1=new Employee(1,"Ashish",50000.0,"Nitin","CSE");
		Employee obj2=new Employee(2,"Ashish",25000.0,"Ashish","ECE");
		Employee obj3=new Employee(3,"Ashish",10000.0,"Sachin","Mech");
		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		EmployeeImplementation obj=new EmployeeImplementation();
		Employee emp2=obj.calculateSalary(list);	
		System.out.println("The employee who earns the most is :" + emp2.getName() + " and earns : " + emp2.getSalary() + " a month.");

	}

}
