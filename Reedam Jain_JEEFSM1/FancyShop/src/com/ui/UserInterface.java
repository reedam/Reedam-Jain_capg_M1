package com.ui;

import java.util.Map;
import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shop obj=new Shop();
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the no of products:");
		int num=sc.nextInt();
		for(int i=0;i<num;i++)
		{
			int sn=sc.nextInt();
			String name=sc.nextLine();
			obj.addProductDetails(sn,name);
		}
		String product=sc1.nextLine();
		System.out.println(obj.searchBasedOnProduct(product));
	}

}
