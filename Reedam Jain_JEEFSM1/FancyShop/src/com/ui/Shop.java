package com.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Shop {
	private Map<Integer,String> productMap;
	public Map<Integer,String> getProductMap(){
		return productMap;
	}
	public void setProductMap(Map<Integer, String> productMap) {
		this.productMap = productMap;
	}
	
	
	public void addProductDetails(int serialNumber,String productName)
	{
		productMap=new TreeMap<Integer,String>();
		productMap.put(serialNumber,productName);	
	}
	
	public List<String> searchBasedOnProduct(String productType){
		List<String> result=new ArrayList<String>();
		for(Map.Entry<Integer,String> entry: productMap.entrySet())
		{
			if(entry.getValue().contains(productType))
				result.add(entry.getValue());
			
		}
		return result;
		
	}
	

}
