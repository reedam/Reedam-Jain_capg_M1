package com.cpg.salary;

import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) throws SalaryNegativeException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name:");
		String name=sc.next();
		System.out.println("Enter gender");
		char gender=sc.next().charAt(0);
		System.out.println("Enter category:");
		String category=sc.next();
		System.out.println("Enter salary:");
		double salary=sc.nextDouble();
		
		Employee obj=new Employee();
		obj.setName(name);
		obj.setGender(gender);
		obj.setCategory(category);
		obj.setSalary(salary);
		
	}

}
