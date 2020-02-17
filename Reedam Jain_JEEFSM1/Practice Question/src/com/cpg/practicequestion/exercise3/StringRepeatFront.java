package com.cpg.practicequestion.exercise3;

public class StringRepeatFront {
	
	
	
	String repeat(String str,int n)
	{
		
		int len=str.length();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<n;i++)
		{
			sb.append(str.substring(0,n-i));
		}
		return sb.toString();
	}

}
