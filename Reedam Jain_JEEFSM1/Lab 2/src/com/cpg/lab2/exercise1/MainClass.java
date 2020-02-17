package com.cpg.lab2.exercise;

public class MainClass {
	public static void main(String[] args) {
		WrittenItem obj = new Book(24,"book",34);
		Book ob = new Book(34,"fad",45);
		System.out.println(ob.equals(obj));
	}

}
