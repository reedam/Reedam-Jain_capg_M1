package com.cpg.lab6.exercise5;

import java.util.Scanner;

public class ModifyNumber {
	public static int modify(int number)
	{
		String s= Integer.toString(number);
		StringBuilder sb=new StringBuilder();
		char ch1,ch2;
		int ch;
		//System.out.println(s);
		if (s.length()==1)
			return number;
		for(int i=0;i<s.length()-1;i++)
		{
			ch1=s.charAt(i+1);
			//System.out.println(ch1);
			ch2=s.charAt(i);
			//System.out.println(ch2);
			ch=((int) (ch1)-(int)(ch2));
			if(ch>0);
			else
				ch=ch*(-1);
			
			System.out.println(ch);
			 
			sb.append(ch);
			//System.out.println((char)(ch+48));
		}
		ch1=s.charAt(0);
		//System.out.println(ch1);
		ch2=s.charAt(s.length()-1);
		//System.out.println(ch2);
		ch=(int)(ch1)-(int)(ch2);
		if(ch>0);
		else
			ch=ch*(-1);
		System.out.println(ch);
		 
		sb.append(ch);
		s=sb.toString();
		number=Integer.parseInt(s);
	
		return number;
	}
}
