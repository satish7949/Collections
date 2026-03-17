package com.jspiders.set;

import java.util.TreeSet;

public class TreeSetEx {
	public static void main(String[] args) {
		TreeSet tr=new TreeSet();
		
		System.out.println("-".repeat(30));
		System.out.println("is set empty ? "+tr.isEmpty());
		System.out.println("Size of set "+tr.size());
		System.out.println(tr);
/*		in tree set it is mandatory to mantance what we add first element all element 
		should be same and tree set also follow sorted order*/
		tr.add(25);
		tr.add(35);
		tr.add(50);
		tr.add(10);
		tr.add(45);
		tr.add(20);
		
		
		System.out.println("is set empty ? "+tr.isEmpty());
		System.out.println("Size of set "+tr.size());
		System.out.println(tr);
		System.out.println("-".repeat(30));
	}
}
