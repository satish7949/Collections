package com.jspiders.map;

import java.util.HashMap;

public class HashMapEx {
	public static void main(String[] args) {
		HashMap hs=new HashMap();
		System.out.println("-".repeat(50));
		System.out.println("is empty? "+hs.isEmpty());
		System.out.println(" size is: "+hs.size());
		
//		store data in map
		
		hs.put(12, "Test");
		hs.put(3.5, true);
		hs.put("pqr", 12345);
		hs.put('t', 5.6);
		hs.put(50, null);
		hs.put(null, 100);
		
		System.out.println("is empty? "+hs.isEmpty());
		System.out.println(" size is: "+hs.size());
		System.out.println("map element");
		System.out.println(hs);
//		==========================adding duplicte its check if key 
//		is same and value the different then the value replace by the new value=========================
		System.out.println("adding duplicate pair");
		hs.put(12, "Demo");
		System.out.println(" size is: "+hs.size());
		System.out.println("map elements");
		System.out.println(hs);
		
//	=========================fetch data from the hashmap with the help of key===================== 
		
		Object value=hs.get(12);  //down casting
		System.out.println("map elements");
		System.out.println(value);

//========================= Remove value from map======================================
		hs.remove(12);
		System.out.println("map elements");
		System.out.println(hs);
		
//================================check inside key /value present or not =========================
		boolean res1=hs.containsKey("pqr");
		boolean res2=hs.containsValue(3.5);
		System.out.println(res1);
		System.out.println(res2);
		
//	=============================	
		
		System.out.println("-".repeat(50));
	}
}
