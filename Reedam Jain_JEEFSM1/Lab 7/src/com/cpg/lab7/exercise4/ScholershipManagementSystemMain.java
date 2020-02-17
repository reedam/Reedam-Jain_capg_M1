package com.cpg.lab7.exercise4;

public class ScholershipManagementSystemMain {

	public static void main(String[] args) {
		ScholershipManagementSystem obj=new ScholershipManagementSystem();
		obj.inputFunction(obj.inputmap);
		System.out.println(obj.calculateScholership(obj.inputmap));

	}

}
