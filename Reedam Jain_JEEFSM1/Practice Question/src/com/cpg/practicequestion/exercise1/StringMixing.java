package com.cpg.practicequestion.exercise1;

public class StringMixing {
	
	String mixString(String str1,String str2)
	{
		StringBuilder sb=new StringBuilder();
		int len1=str1.length();
		int len2=str2.length();
		if(len1<len2) {
		for(int i=0;i<len1;i++)
		{
			sb.append(str1.charAt(i));
			sb.append(str2.charAt(i));
		}
		for(int i=len1;i<len2;i++)
		{
			sb.append(str2.charAt(i));
		}
		}
		else {
			for(int i=0;i<len2;i++)
			{
				sb.append(str1.charAt(i));
				sb.append(str2.charAt(i));
			}
			for(int i=len2;i<len1;i++)
			{
				sb.append(str1.charAt(i));
			}
		}
			if(len1==len2)
			{
				for(int i=0;i<len2;i++)
				{
					sb.append(str1.charAt(i));
					sb.append(str2.charAt(i));
				}
			}
		
		String result=sb.toString();
		return result;
	}

}
