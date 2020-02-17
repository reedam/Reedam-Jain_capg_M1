package com.cpg.leastdiscount;

import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int noOfProducts=sc.nextInt();
		String products[]=new String[noOfProducts];
		for(int i=0;i<noOfProducts;i++)
		{
			products[i]=sc.next();
		}
		MarketPlace obj=new MarketPlace();
		obj.discount(products);

	}

}
