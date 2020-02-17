package com.cpg.practicequestion.exercise5;

public class FindBob {
	
	boolean bobThere(String str)
	{
		int len=str.length();
		char[] strarr;
		strarr=str.toCharArray();
		if(str.length()<3)
			return false;
		for(int i=0;i<strarr.length-2;i++)
		{
			if(strarr[i]=='b' && strarr[i+2]=='b')
				return true;
			
		}
		return false;
	}

}
