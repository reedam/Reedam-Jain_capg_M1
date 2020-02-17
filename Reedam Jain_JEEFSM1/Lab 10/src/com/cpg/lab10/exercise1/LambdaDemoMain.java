package com.cpg.lab10.exercise1;
import java.io.*;
import java.util.*;
import java.lang.*;

public class LambdaDemoMain {

	public static void main(String[] args) {
		LambdaDemo obj=new LambdaDemo();
		obj.getInput();
		returnable obj2=(x,y)->(Math.pow(x, y));
		System.out.println(obj2.sqaureInteger(obj.num1, obj.num2));

	}

}
