package com.jspiders.LearningArrayList;

import java.util.ArrayList;

public class Print_String_Only {
	public static void main(String[] args) {
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
		
		for(int r=0;r<l1.size();r++)
		{
			if(l1.get(r) instanceof String)
			{
				System.out.println(l1.get(r));
			}
		}
		
		
		System.out.println("-------------------------------------------");
		System.out.println("convert string into uppercase");
		for(int r=0;r<l1.size();r++)
		{
			if(l1.get(r) instanceof String)
			{
				String str=((String)l1.get(r)).toUpperCase();
				System.out.println(str);
			}
		}
		
		
		
		System.out.println("-------------------------------------------");
		System.out.println("convert string into lowercase");
		for(int r=0;r<l1.size();r++)
		{
			if(l1.get(r) instanceof String)
			{
				String str=((String)l1.get(r)).toLowerCase();
				System.out.println(str);
			}
		}
	}
}
