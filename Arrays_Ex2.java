package com.jspiders.learningArrays;
class Book{
	int id;
	int pages;
	String coverbind;
	double price;
	
	public Book(int id, int pages, String coverbind, double price) {
		super();
		this.id = id;
		this.pages = pages;
		this.coverbind = coverbind;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", pages=" + pages + ", coverbind=" + coverbind + ", price=" + price + "]";
	}
	
	
}
class NoteBook extends Book{
	String type;
	String size;
	
	public NoteBook(int id, int pages, String coverbind, double price, String type, String size) {
		super(id, pages, coverbind, price);
		this.type = type;
		this.size = size;
	}

	@Override
	public String toString() {
		return "NoteBook [type=" + type + ", size=" + size + "]";
	}
	
	
}
class TextBookk extends Book{
	String title;
	String author;
	int eddition;
	
	public TextBookk(int id, int pages, String coverbind, double price, String title, String author, int eddition) {
		super(id, pages, coverbind, price);
		this.title = title;
		this.author = author;
		this.eddition = eddition;
	}

	@Override
	public String toString() {
		return "TextBook [title=" + title + ", author=" + author + ", eddition=" + eddition + "]";
	}
	
}
public class Arrays_Ex2 {
	public static void main(String[] args) {
		System.out.println("Main method start:");
		System.out.println("--------------------------------------------------");
		
		Book[] books=new Book[10];
		
		books[0]=new Book(111,200,"Soft",250.00);
		books[1]=new TextBookk(222,700,"Soft",500.00,"Java","Pawan",2);
		books[2]=new NoteBook(333,300,"hard",150.00,"Ruled","Long");
	
		books[4]=new Book(444,200,"Soft",190.00);
		books[5]=new TextBookk(555,400,"Soft",250.00,"LP","Sameer",17);
		
		books[7]=new Book(666,200,"Hard",200.00);
		
		books[9]=new TextBookk(777,900,"Soft",220.00,"Web","Gaurav",3);
		
		
		int tbctn=0,ntctn=0,bctn=0;
		for(int r=0;r<books.length;r++)
		{
			if(books[r] instanceof TextBookk) {
				TextBookk tb=(TextBookk)books[r];
//			    System.out.println(tb.id+"\t"+tb.pages+"\t"+tb.coverbind+"\t"+tb.price+"\t"+tb.title+"\t"+
//				tb.author+"\t"+tb.eddition);
				tbctn++;
			}
			else if(books[r] instanceof NoteBook)
			{
				NoteBook nb=(NoteBook)books[r];
//				System.out.println(nb.id+"\t"+nb.pages+"\t"+nb.coverbind+"\t"+nb.price+"\t"+nb.type+"\t"+nb.size);
				ntctn++;
			}
			else if(books[r] instanceof Book)
			{
//				System.out.println(books[r].id+"\t"+books[r].pages+"\t"+books[r].coverbind+"\t"+books[r].price);
				bctn++;
			}
		}
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//===========================Assignment count number of books which type and print================================== 
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++		
		System.out.println("NoteBook present: "+ntctn);
		for(int r=0;r<books.length;r++)
		{
			if(books[r] instanceof NoteBook)
			{
				NoteBook nb=(NoteBook)books[r];
				System.out.println(nb.id+"\t"+nb.pages+"\t"+nb.coverbind+"\t"+nb.price+"\t"+nb.type+"\t"+nb.size);
			}
		}
		System.out.println("TextBook present: "+tbctn);
		for(int r=0;r<books.length;r++)
		{
			if(books[r] instanceof TextBookk) {
				TextBookk tb=(TextBookk)books[r];
			    System.out.println(tb.id+"\t"+tb.pages+"\t"+tb.coverbind+"\t"+tb.price+"\t"+tb.title+"\t"+
				tb.author+"\t"+tb.eddition);
			}
		}
		System.out.println("Book presetn: "+bctn);
		for(int r=0;r<books.length;r++)
		{
			if(books[r] instanceof NoteBook)
			{
				continue;
			}
			else if(books[r] instanceof TextBookk)
			{
				continue;
			}
			else if(books[r] instanceof Book)
			{
			System.out.println(books[r].id+"\t"+books[r].pages+"\t"+books[r].coverbind+"\t"+books[r].price);
			}
		}
		System.out.println("--------------------------------------------------");
		System.out.println("main method ends");
	}
}
