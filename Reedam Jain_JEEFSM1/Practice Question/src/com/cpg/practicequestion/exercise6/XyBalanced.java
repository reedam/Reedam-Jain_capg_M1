package com.cpg.practicequestion.exercise6;

public class XyBalanced {
	
	boolean balancedXy(String str)
	{
		int index1=str.indexOf("x");
		int index2=str.indexOf("y");
		if(index1<index2)
			return true;
		else
			return false;
		
	}

}
