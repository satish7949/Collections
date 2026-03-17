package com.jspiders.set;
import java.util.HashSet;

public class HashSetEx {
	public static void main(String[] args) {
		HashSet set1=new HashSet();
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
		System.out.println("Accessing element from the Hashset");
		for(Object element : set1)
		{
			System.out.println(element);
		}
		
		System.out.println("-".repeat(30));
	}
}
