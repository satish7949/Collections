package com.jspider.priorityqueue;

import java.util.PriorityQueue;

public class RemoveElement {
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

//=================================First Method to removing element from queue==========================		
		
//		while(pq.isEmpty() !=true)
//		{
//			System.out.println("Remoing element from queue");
//			Object o1=pq.poll();
//			System.out.println(o1);
//		}
		
		
//=================================Second Method to removing element from queue======================================================
		Object o2=pq.poll();
//	    while(o2!=null)
//		{
//			System.out.println("Remoing element from queue");
//			System.out.println(o2);
//			o2=pq.poll();
//				
//		}
		
//=====================================================================================================		
		int ctn=0;
		while(o2!=null)
		{		
			if(ctn==3) {
				System.out.println("Removing nth element:");
				System.out.println(o2);
			}
			o2=pq.poll();
			ctn++;
				
		}
		
		
		
		System.out.println("-".repeat(25));
	}
		
}
