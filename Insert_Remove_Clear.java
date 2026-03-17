package com.jspiders.LearningArrayList;
import java.util.ArrayList;

public class Insert_Remove_Clear {
	public static void main(String[] args) {
		System.out.println("main method started ");
		System.out.println("---------------------------------------------------------------------------------");
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
		
		System.out.println("Total size: "+l1.size());
		System.out.println("Element are ");
		System.out.println(l1);
		
		System.out.println("--------------------------insert-------------------------------------------------------");
		System.out.println("insert an element ");
		l1.add(2,"Pineapple");
		System.out.println("Total size: "+l1.size());
		System.out.println(l1);
		
		
		
		System.out.println("--------------------------------remove-------------------------------------------------");
		System.out.println("removing an element ");
		l1.remove("Pineapple"); //------------------->remove the particular element
		l1.remove(2); //----------------------------->removing element present at index 2
		l1.remove(new Integer(20)); //--------------->removing element 20
		System.out.println("Total size: "+l1.size());
		System.out.println(l1);
		
		
		
		System.out.println("---------------------------clear------------------------------------------------------");
		l1.clear();
		System.out.println("Total size: "+l1.size());
		System.out.println(l1);
		
		
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("main method ended ");
	}
}
