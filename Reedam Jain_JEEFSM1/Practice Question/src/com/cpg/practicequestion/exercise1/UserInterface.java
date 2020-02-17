package com.cpg.practicequestion.exercise1;

import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		StringMixing obj=new StringMixing();
		String result=obj.mixString(str1, str2);
		System.out.println("Resultant String:"+result);
	}

}
