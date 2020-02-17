package com.cpg.practicequestion.Streamapi;

public class Employee {
	private int empid;
	private String name;
	private double salary;
	private String mgrname;
	private String deptno;
	public Employee(int empid, String name, double salary, String mgrname, String deptno) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.mgrname = mgrname;
		this.deptno = deptno;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
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
	public String getMgrname() {
		return mgrname;
	}
	public void setMgrname(String mgrname) {
		this.mgrname = mgrname;
	}
	public String getDeptno() {
		return deptno;
	}
	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}
	
	

}
