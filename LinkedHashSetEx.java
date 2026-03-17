package com.jspiders.set;

import java.util.LinkedHashSet;

public class LinkedHashSetEx {
	public static void main(String[] args) {
		LinkedHashSet set1= new LinkedHashSet(); //create empty LinkedHashSet 
		
		System.out.println("-".repeat(30));
		System.out.println("is set empty ? "+set1.isEmpty());
		System.out.println("Size of set "+set1.size());
		System.out.println(set1);
		set1.add(25);
		set1.add("Test");
		set1.add(5.6);
		set1.add('t');
		set1.add(true);
		set1.add(null);
		
	
		System.out.println("is set empty ? "+set1.isEmpty());
		System.out.println("Size of set "+set1.size());
		System.out.println(set1);
		System.out.println("-".repeat(30));
	
	}
}
