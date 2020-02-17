package com.cpg.calldeatils;

import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter call data:");
		String details=sc.nextLine();
		
		Long num=sc1.nextLong();
		Call callObject=new Call();
		callObject.parseData(details);
		CallHistory obj=new CallHistory();
		obj.addCall(callObject);
		System.out.println(obj.findTotalDuration(num));
	}

}
