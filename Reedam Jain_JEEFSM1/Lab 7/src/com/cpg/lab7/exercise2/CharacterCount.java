package com.cpg.lab7.exercise2;

import java.io.*;
import java.util.*;
import java.util.Scanner;

public class CharacterCount {

	Scanner sc=new Scanner(System.in);
	
	char[] getValue() {
		char[] array=sc.next().toCharArray();
		return array;
	}
	
	HashMap<Character,Integer> hm=new HashMap <Character,Integer>();
	
	void countMap(char[] array)
	{
		for(char c: array)
		{
			if(hm.containsKey(c))
			{
				hm.put(c,hm.get(c)+1);
			}
			else
				hm.put(c,1);
		}
		
		for(Map.Entry entry: hm.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
	}

}
