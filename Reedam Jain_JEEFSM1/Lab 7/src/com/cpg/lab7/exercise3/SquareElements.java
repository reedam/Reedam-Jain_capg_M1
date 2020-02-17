package com.cpg.lab7.exercise3;

import java.io.*;
import java.util.*;

public class SquareElements {
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int[] array=new int[size];
	
	int[] getArray()
	{	
		System.out.println("Enter "+size+" Elements:");
		for(int i=0;i<size;i++)
		{
			array[i]=sc.nextInt();
		}
		return array;
		
	}
	
	void sqaureMethod(int[] array)
	{
		HashMap<Integer,Integer> arraymap=new HashMap<Integer,Integer>();
		for(int element: array)
		{
			arraymap.put(element, element*element);
		}
		for(Map.Entry entry : arraymap.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
	
}
