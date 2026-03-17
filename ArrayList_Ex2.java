package com.jspiders.LearningArrayList;

import java.util.ArrayList;

public class ArrayList_Ex2 {
public static void main(String[] args) {
	System.out.println("main method started");
	System.out.println("-----------------------------");
	ArrayList l1=new ArrayList();
	
	l1.add(100);
	l1.add("Apple");
	l1.add(5.07);
	l1.add("Orange");
	l1.add(true);
	l1.add('S');
	l1.add("Ganesh");
	l1.add(8.7);
	l1.add("Mango");
	l1.add("Graps");
	
	int n=l1.size();
	System.out.println(n);
	
	System.out.println("ArrayList Element:");
	System.out.println(l1);
	
	String str=(String)l1.get(3);
	System.out.println(str);
	
	double d=(Double)l1.get(2);
	System.out.println(d);
	
	System.out.println("Array element using for loop");
	for(int r=0;r<l1.size();r++)
	{
		System.out.println(l1.get(r));
	}

	System.out.println("-----------------------------");
	System.out.println("main method ended");
}
}
