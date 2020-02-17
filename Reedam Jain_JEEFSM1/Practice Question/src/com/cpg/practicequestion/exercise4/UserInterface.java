package com.cpg.practicequestion.exercise4;

import java.util.Scanner;

import com.cpg.practicequestion.exercise3.StringRepeatFront;

public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		StringContains obj=new StringContains();
		boolean result=obj.xyzThere(str);
		System.out.println(result);

	}

}
