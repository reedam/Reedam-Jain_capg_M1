package com.cpg.EmployeeMain;

public class Employee {
	private int eid;
	private String name;
	private double salary;
	private double pfper;
	public Employee(int eid, String name, double salary, double pfper) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
		this.pfper = pfper;
	}
	
	
	public int getEid() {
		return eid;
	}


	public void setEid(int eid) {
		this.eid = eid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public double getPfper() {
		return pfper;
	}


	public void setPfper(double pfper) {
		this.pfper = pfper;
	}


	public double calNetPay() {
		if(pfper<=5)
		{
			return salary;
		}
		else
			return salary-salary*(pfper/100);
	}

}
