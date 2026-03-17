package com.jspiders.learningArrays;

class TextBook{
	int id;
	String title;
	String author;
	int edition;
	double price;
	
	public TextBook(int id,String title,String author, int edition,double price) {
		this.id=id;
		this.title=title;
		this.author=author;
		this.edition=edition;
		this.price=price;
	}
	
	public String toString() {
		return this.id+"\t"+this.title+"\t"+this.author+"\t"+this.edition+"\t"+this.price;
	}
}
public class Arrays_Ex1 {
	public static void main(String[] args) {
		TextBook[] books=new TextBook[5];
		
		books[0]=new TextBook(555,"JAVA","Keshav",2,150.00);
		books[1]=new TextBook(222,"SQL","Sharath",3,250.00);
		books[2]=new TextBook(111,"LP","Sameer",3,250.00);
		books[3]=new TextBook(333,"Web","Harish",1,100.00);
		books[4]=new TextBook(444,"DSA","Darshan",2,350.00);
		
		System.out.println("Books Detail:");
		System.out.println("-----------------------------------------------");
		System.out.println("ID\tTitle\tAuthor\tEddition\tPrice");
		System.out.println("-----------------------------------------------");
		for(int r=0;r<books.length;r++)
		{
			System.out.println(books[r].id+"\t"+books[r].title+"\t"+books[r].author+"\t"+books[r].edition+"\t\t"+books[r].price);
		}
		System.out.println("-----------------------------------------------");
		
//==================================================================================================================		
		
		System.out.println();
		System.out.println("Books: Coding related");
		System.out.println("-----------------------------------------------");
		System.out.println("ID\tTitle\tAuthor\tEddition\tPrice");
		System.out.println("-----------------------------------------------");
		for(int r=0;r<books.length;r++)
		{
			if(books[r].title.equalsIgnoreCase("Java") || books[r].title.equalsIgnoreCase("LP") || books[r].title.equalsIgnoreCase("Dsa")) {
			System.out.println(books[r].id+"\t"+books[r].title+"\t"+books[r].author+"\t"+books[r].edition+"\t\t"+books[r].price);
			}
		}
		System.out.println("------------------------------------------------");

//==================================================================================================================	
		
		System.out.println();
		System.out.println("Books: whose price above Rs 200 ");
		System.out.println("------------------------------------------------");
		System.out.println("ID\tTitle\tAuthor\tEddition\tPrice");
		System.out.println("------------------------------------------------");
		for(int r=0;r<books.length;r++)
		{
			if(books[r].price>200)
			{
			System.out.println(books[r].id+"\t"+books[r].title+"\t"+books[r].author+"\t"+books[r].edition+"\t\t"+books[r].price);
			}
		}
		System.out.println("-------------------------------------------------");

	}
}
