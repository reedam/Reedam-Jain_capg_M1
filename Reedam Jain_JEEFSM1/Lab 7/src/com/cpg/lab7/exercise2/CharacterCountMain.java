package com.cpg.lab7.exercise2;

public class CharacterCountMain {

	public static void main(String[] args) {
		System.out.println("Enter characters without space :");
		CharacterCount obj=new CharacterCount();
		obj.countMap(obj.getValue());
	}

}
