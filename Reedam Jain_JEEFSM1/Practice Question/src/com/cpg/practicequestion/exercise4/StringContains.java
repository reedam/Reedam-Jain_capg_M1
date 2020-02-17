package com.cpg.practicequestion.exercise4;

public class StringContains {
	boolean xyzThere(String str)
	{
		if(str.contains(".xyz"))
			return false;
		else if(str.contains("xyz"))
			return true;
		else 
			return false;
	}

}
