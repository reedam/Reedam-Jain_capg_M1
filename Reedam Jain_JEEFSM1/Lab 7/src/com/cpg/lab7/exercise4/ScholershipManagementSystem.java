package com.cpg.lab7.exercise4;

import java.util.*;
import java.io.*;

public class ScholershipManagementSystem {
	Scanner sc=new Scanner(System.in);
	HashMap<Integer,Integer> inputmap=new HashMap<Integer,Integer>();
	
	HashMap<Integer,Integer> inputFunction(HashMap<Integer,Integer> inputmap)
	{	
		System.out.println("Enter the no of enteries: ");
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			inputmap.put(sc.nextInt(), sc.nextInt());
		}
		
		return inputmap;
	}
	
	HashMap<Integer,String> calculateScholership(HashMap<Integer,Integer> inputmap)
	{
		int temp;
		HashMap<Integer,String> resultmap=new HashMap<Integer,String>();
		for(Map.Entry<Integer,Integer> entry: inputmap.entrySet())
		{
			temp=entry.getValue();
			if(temp>=90)
				resultmap.put(entry.getValue(),"GOLD");
			else if(temp>=80 && temp<90)
				resultmap.put(entry.getValue(),"SILVER");
			else if(temp>=70 && temp<80)
				resultmap.put(entry.getValue(),"BRONZE");
			else
				resultmap.put(entry.getValue(), "NOT ELIGIBLE");		
		}
		return resultmap;
	}

}
