package com.jspider.priorityqueue;

import java.util.LinkedList;

public class DequeOperation {
	public static void main(String[] args) {
	LinkedList l1=new LinkedList();
	l1.add(20);
	l1.add(45);
	l1.add(12);
	l1.add(25);
	l1.add(9);
	l1.add(30);
	
	//Deque Operation
	System.out.println("-".repeat(30));
	System.out.println("List element");
	System.out.println(l1);
	System.out.println("-".repeat(30));
	
	System.out.println("Add first in the deque");
	l1.addFirst(100);
	System.out.println(l1);
	
	System.out.println("-".repeat(30));
	System.out.println("Add Last in the deque");
	l1.addLast(200);
	System.out.println(l1);
	
	System.out.println("-".repeat(30));
	System.out.println("get first from the deque");
	Object o1=l1.getFirst();
	System.out.println(o1);
	
	System.out.println("-".repeat(30));
	System.out.println("get Last from the deque");
	Object o2=l1.getLast();
	System.out.println(o2);
	System.out.println("-".repeat(30));
	
	System.out.println("remove first from the deque");
	Object o3=l1.removeFirst();
	System.out.println(o3);
	System.out.println(l1);
	System.out.println("-".repeat(30));
	
	System.out.println("remove last from the deque ");
	Object o4=l1.removeLast();
	System.out.println(o4);
	System.out.println(l1);
	System.out.println("-".repeat(30));
	}
}
