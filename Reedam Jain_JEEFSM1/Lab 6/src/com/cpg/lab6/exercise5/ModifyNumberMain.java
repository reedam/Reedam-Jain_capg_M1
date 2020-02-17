package com.cpg.lab6.exercise5;

import java.util.Scanner;

public class ModifyNumberMain {
	public static void main(String ar [])
	{
		ModifyNumber obj=new ModifyNumber();
		int number;
		Scanner sc=new Scanner(System.in);
		number=sc.nextInt();
		System.out.println(obj.modify(number));
	}

}
