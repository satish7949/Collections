package com.jspiders.LearningArrayList;
import java.util.ArrayList;
public class ArrayList_Ex1 {
	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("-----------------------------");
		ArrayList l1=new ArrayList();
		
		boolean res=l1.isEmpty();
		System.out.println(res);
		
		int n=l1.size();
		System.out.println(n);
		
		l1.add(100);
		l1.add("Apple");
		l1.add(5.07);
		l1.add("Orange");
		l1.add(true);
		l1.add('S');
		l1.add("Ganesh");
		
		res=l1.isEmpty();
		System.out.println(res);
		
		n=l1.size();
		System.out.println(n);
		
		System.out.println("-----------------------------");
		System.out.println("main method ended");
	}
}
