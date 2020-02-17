package com.cpg.lab7.exercise1;

import java.util.*;
import java.io.*;

public class SortedList {
	Scanner sc=new Scanner(System.in);
	HashMap<Integer,Integer> array=new HashMap<Integer,Integer>();
	void getMap()
	{
		
		int size=sc.nextInt();                                                                                          
		for(int i=0;i<size;i++)
		{
			array.put(sc.nextInt(), sc.nextInt());
		}
	}
	
	ArrayList<Integer> sortList(HashMap<Integer,Integer> array)
	{
		int temp;
		ArrayList<Integer> sortedarray=new ArrayList<Integer>();
		for(Map.Entry<Integer, Integer> entry: array.entrySet())
		{
			temp=entry.getValue();
			sortedarray.add(temp);
			}
		 Collections.sort(sortedarray);
		 return sortedarray;
	}
	}

