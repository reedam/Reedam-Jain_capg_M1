package com.cpg.lab7.exercise8;
import java.util.*;
import java.io.*;

public class DuplicationHandling {
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int[] array=new int[size];
	void getArray()
	{
		
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter element "+(i+1)+"=");
			array[i]=sc.nextInt();
		}
	}
	
	void modifyArray(int[] array)
	{
		int temp;
		TreeSet<Integer> hset=new TreeSet<Integer>();
		for(int i=0;i<size;i++)
		{
			temp=array[i];
			hset.add(temp);
		}
		System.out.println(hset.descendingSet());	
	}
	
}
