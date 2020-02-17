package com.cpg.practicequestion.Streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class getEmployeeList
{
	public List<Employee> allSalary(List<Employee> list)
	{
		//Employee emp;

Map<Integer, List<Employee>> result = list.stream().collect(groupingBy(Employee::getSalary));
		List<Employee> allMin = result.entrySet().stream()
		        .min(Comparator.comparing(Map.Entry::getKey))
		        .map(Map.Entry::getValue)
		        .orElse(Collections.emptyList());
	}
}

public class EmployeeSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee>  list=new ArrayList<Employee>();
		Employee obj1=new Employee(1,"Ashish",50000.0,"Nitin","CSE");
		Employee obj2=new Employee(2,"Raju",25000.0,"Ashish","ECE");
		Employee obj3=new Employee(3,"Ashish",10000.0,"Nitin","Mech");
		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		getEmployeeList obj=new getEmployeeList();
		System.out.println(obj.allSalary(list));
		

	}

}
