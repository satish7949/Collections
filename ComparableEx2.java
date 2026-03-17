package com.jspiders.set;
import java.util.TreeSet;
//Question:-store employee object in treeSet and sorted based on the id of the employee

//Employee object are mutually Comparable in nature
class Employee implements Comparable<Employee>{
	int id;
	String name;
	double sal;
	double expc;
	public Employee(int id, String name, double sal, double expc) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.expc = expc;
	}
	public int compareTo(Employee e) {
		if(this.id>e.id)
		{
			return 1;
		}
		else if(this.id<e.id)
		{
			return -1;
		}
		else {
			return 0;
		}
	}
}
public class ComparableEx2 {
	public static void main(String[] args) {

	Employee e1=new Employee(103,"Bheem",4500.00,1.9);
	Employee e2=new Employee(107,"Chutki",1500.00,1.0);
	Employee e3=new Employee(102,"Kalia",5500.00,1.12);
	Employee e4=new Employee(104,"Indu",5000.00,1.9);
	Employee e5=new Employee(101,"Raju",2500.00,2.0);
	
	TreeSet<Employee> empSet=new TreeSet<Employee>();
		empSet.add(e1);
		empSet.add(e2);
		empSet.add(e3);
		empSet.add(e1);
		empSet.add(e4);
		empSet.add(e5);
		
		System.out.println("-".repeat(50));
		System.out.println("Id\tName\tSalary\tExperince");
		System.out.println("-".repeat(50));
		for(Employee emp:empSet)
		{
			System.out.println(emp.id+"\t"+emp.name+"\t"+emp.sal+"\t"+emp.expc);
		}
		System.out.println("-".repeat(50));	
	}
}
