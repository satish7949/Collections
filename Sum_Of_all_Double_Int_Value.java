package com.jspiders.LearningArrayList;

import java.util.ArrayList;

public class Sum_Of_all_Double_Int_Value {
	public static void main(String[] args) {
		
		ArrayList l1=new ArrayList();
		l1.add(10);
		l1.add("Apple");
		l1.add(5.7);
		l1.add("Orange");
		l1.add(true);
		l1.add('S');
		l1.add("Ganesh");
		l1.add(20);
		l1.add("Mango");
		l1.add(4.2);
		l1.add("Graps");
		
		double sum=0.0;
//most important approach and inbuilt class Number
		for(int r=0;r<l1.size();r++)
		{
			if(l1.get(r) instanceof Number)
			{
				sum = sum + ((Number)l1.get(r)).doubleValue(); 
				//first down casting and then call abstract method (doubleValue()) of Number class 
			}
		}
		System.out.println("Total sum= "+sum);
		
		
		System.out.println("-------------------second approach--------------------------------------");
		for(int r=0;r<l1.size();r++)
		{
			if(l1.get(r) instanceof Integer)
			{
				sum = sum + (Integer)l1.get(r);  //down casting 
			}else if(l1.get(r) instanceof Double)
			{
				sum = sum + (Double)l1.get(r);  //down casting
			}
		}
		System.out.println("Total sum= "+sum);
		
		
	}
}
