package com.cpg.practicequestion.exercise5;

import java.util.Scanner;


public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		FindBob obj=new FindBob();
		boolean result=obj.bobThere(str);
		System.out.println(result);

	}

}
