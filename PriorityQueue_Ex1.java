package com.jspider.priorityqueue;
import java.util.PriorityQueue;

public class PriorityQueue_Ex1 {
public static void main(String[] args) {
	System.out.println("-".repeat(25));
	PriorityQueue pq=new  PriorityQueue();
	System.out.println("is queue empty: "+pq.isEmpty());
	System.out.println("size of queue: "+pq.size());
	System.out.println("queue element:");
	System.out.println(pq);
	
	pq.add(20);
	pq.add(45);
	pq.add(12);
	pq.add(9);
	pq.add(25);
	pq.add(30);
	
	System.out.println("is queue empty: "+pq.isEmpty());
	System.out.println("size of queue: "+pq.size());
	System.out.println("queue element:");
	System.out.println(pq);
	
	//its gives priority lowest value and the return lowest value
	Object o1=pq.peek();
	System.out.println(o1);
	
	//poll method remove head element from the priority queue and return remaining element
	
	Object o2=pq.poll();
	System.out.println("is queue empty: "+pq.isEmpty());
	System.out.println("size of queue: "+pq.size());
	System.out.println("queue element:");
	System.out.println(pq);
	
	
	System.out.println("-".repeat(25));
}
}
