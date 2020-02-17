package com.cpg.practicequestion.exercise2;

public class StringRep {
	String repetition(String str,int n)
	{
		int len=str.length();
		String s=str.substring(len-n,len);
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<n;i++)
		{
			sb.append(s);
		}
		return sb.toString();
		
		
	}
}
