package com.jspiders.set;
class MyNumber implements Comparable{
	int n;
	public MyNumber(int n)
	{
		this.n=n;
	}
	public int compareTo(Object arg)
	{
		MyNumber num=(MyNumber)arg;//------>here we are perform down casting 
//		return this.n-num.n;    // instead of we can write below statement ....
		if(this.n>num.n)
		{
			return 1;
		}
		else if(this.n<num.n)
		{
			return -1;
		}
		else {
			return 0;
		}
	}
}
public class ComaparableEx {
public static void main(String[] args) {
	MyNumber num1=new MyNumber(10);
	MyNumber num2=new MyNumber(5);
	
	System.out.println("-".repeat(50));
	System.out.println(num1.compareTo(num2));//positive response --> if value is greater than first value 
	System.out.println(num2.compareTo(num1));//negative response--> if value is less than first value
	System.out.println(num2.compareTo(num2)); //if value are same then return zero(0).
	System.out.println("-".repeat(50));
	
}
}
