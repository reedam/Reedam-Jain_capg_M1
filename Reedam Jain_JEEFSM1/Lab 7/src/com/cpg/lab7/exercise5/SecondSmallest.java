package com.cpg.lab7.exercise5;
import java.io.*;
import java.util.*;

public class SecondSmallest {
	Scanner sc=new Scanner(System.in);
	ArrayList<Integer> arr=new ArrayList<Integer>();
	int size;
	
	void getArray()
	{
		int temp;
		System.out.println("Enter the size of array: ");
		size=sc.nextInt();
		for(int i=0;i<size;i++) {
			System.out.println("Enter element "+(i+1)+" :");
			temp=sc.nextInt();
			arr.add(temp);
		}
	}
	
	int sortArray(ArrayList<Integer> arr)
	{
		Collections.sort(arr);
		return arr.get(1);
	}
	
	void displayArray()
	{
		System.out.println("size= "+size);
		System.out.println("Array= "+arr);
		System.out.println("Second smallest element: "+sortArray(arr));
	}

}
