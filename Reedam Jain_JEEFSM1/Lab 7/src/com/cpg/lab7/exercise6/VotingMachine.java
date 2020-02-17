package com.cpg.lab7.exercise6;
import java.util.*;
import java.io.*;

public class VotingMachine {
	int size;
	Scanner sc=new Scanner(System.in);
	Map<Integer,Integer> reg=new HashMap<Integer,Integer>();
	
	void getRegistration()
	{
		System.out.println("Enter the no of person :");
		size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			reg.put(sc.nextInt(), sc.nextInt());
		}
	}
	
	ArrayList<Integer> calculateAge(Map<Integer,Integer> reg)
	{
		ArrayList<Integer> voters=new ArrayList<Integer>();
		for(Map.Entry<Integer,Integer> entry: reg.entrySet())
		{
			if(entry.getValue()<18)
				continue;
			else
				voters.add(entry.getKey());				
		}
		return voters;
	}
	void displayVoters()
	{
		System.out.println("Eligible voters :");
		System.out.println(calculateAge(reg));
	}

}
