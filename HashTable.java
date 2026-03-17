package com.jspiders.map;

import java.util.Hashtable;

public class HashTable {
	public static void main(String[] args) {
		Hashtable hs=new Hashtable();
		System.out.println("-".repeat(50));
		System.out.println("is empty? "+hs.isEmpty());
		System.out.println(" size is: "+hs.size());
		
//		store data in map
		
		hs.put(12, "Test");
		hs.put(3.5, true);
		hs.put("pqr", 12345);
		hs.put('t', 5.6);
//		hs.put(null, 50);  //doesn't allow null value
		
		
		System.out.println("is empty? "+hs.isEmpty());
		System.out.println(" size is: "+hs.size());
		System.out.println("map element");
		System.out.println(hs);

		System.out.println("adding duplicate pair");
		hs.put(12, "Demo");
		System.out.println(" size is: "+hs.size());
		System.out.println("map elements");
		System.out.println(hs);
		
		System.out.println("-".repeat(50));
	}
}
