package com.cpg.lab3.exercise2;

import java.util.Scanner;

public class sortAlphabeticalMain {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string:");
		String string=sc.nextLine();
		SortAlphabetical ex=new SortAlphabetical();
		String string1=ex.upperLower(string);
		System.out.println(string1);
		sc.close();
	}

}
