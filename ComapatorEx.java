package com.jspiders.set;
import java.util.Comparator;
import java.util.TreeSet;


class SalaryComparator implements Comparator<Employee>
{
	public int compare(Employee e1,Employee e2)  //comparator with salary
	{
		if(e1.sal>e2.sal)
		{
			return 1;
		}
		else if(e1.sal<e2.sal)
		{
			return -1;
		}
		else {
			return 0;
		}
	}
}

class ExperienceComparator implements Comparator<Employee>
{
	public int compare(Employee e1,Employee e2) //comparator with experience
	{
		if(e1.expc>e2.expc)
		{
			return 1;
		}
		else if(e1.expc<e2.expc)
		{
			return -1;
		}
		else {
			return 0;
		}
	}
}
public class ComapatorEx {
	public static void main(String[] args) {
		Employee e1=new Employee(103,"Bheem",4500.00,1.9);
		Employee e2=new Employee(107,"Chutki",1500.00,1.0);
		Employee e3=new Employee(102,"Kalia",5500.00,1.12);
		Employee e4=new Employee(104,"Indu",5000.00,1.9);
		Employee e5=new Employee(101,"Raju",2500.00,2.0);
		
		System.out.println("Sorting based on salary");
		SalaryComparator salCamparator=new SalaryComparator();
		TreeSet<Employee> empSet=new TreeSet<Employee>(salCamparator);
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
			System.out.println();
			System.out.println();
//======================================================================================================
			System.out.println("Sorting based on experience");
			 ExperienceComparator expCampar=new  ExperienceComparator();
			 TreeSet<Employee> empSet1=new TreeSet<Employee>(expCampar);
				empSet1.add(e1);
				empSet1.add(e2);
				empSet1.add(e3);
				empSet1.add(e1);
				empSet1.add(e4);
				empSet1.add(e5);
				
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
