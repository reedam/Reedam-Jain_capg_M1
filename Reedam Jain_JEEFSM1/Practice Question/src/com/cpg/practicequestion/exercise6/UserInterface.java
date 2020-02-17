package com.cpg.practicequestion.exercise6;

import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		XyBalanced obj=new XyBalanced();
		boolean result=obj.balancedXy(str);
		System.out.println(result);

	}

}
