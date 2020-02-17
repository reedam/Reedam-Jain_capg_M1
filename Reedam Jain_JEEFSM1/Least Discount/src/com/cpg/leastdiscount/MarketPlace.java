package com.cpg.leastdiscount;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MarketPlace {
	private String name;
	private int price;
	private int discount;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	Map<String,Integer> map1=new HashMap();
	Map<Integer,String> map2=new TreeMap();
	
	void discount(String[] str)
	{
		for(int i=0;i<str.length;i++)
		{
			String[] tmp=str[i].split(",");
			map1.put(str[0],Integer.parseInt(str[1]));
			discount=(Integer.parseInt(str[1])*Integer.parseInt(str[2]))/100;
			map2.put(discount,str[0]);
		}
		for(Map.Entry<Integer,String> entry: map2.entrySet())
		{
			System.out.println(entry.getValue());
			System.out.println(entry.getKey());
			break;
		}
		
		
	}
	

}
