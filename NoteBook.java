package com.jspiders.set;
import java.util.ArrayList;
class NoteBookEx {
	private int id;
	private String brand;
	private double price;
	private int pages;
	
	public NoteBookEx(int id, String brand, double price, int pages) {
		super();
		this.id = id;
		this.brand = brand;
		this.price = price;
		this.pages = pages;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}
		
}

public class NoteBook{
	public static void main(String[] args) {
		
		NoteBookEx b1=new NoteBookEx(103,"Clsmate",45.00,100);
		NoteBookEx b2=new NoteBookEx(102,"Sulekha",35.00,100);
		NoteBookEx b3=new NoteBookEx(104,"Doms",45.00,120);
		NoteBookEx b4=new NoteBookEx(101,"Nataraj",45.00,100);
		NoteBookEx b5=new NoteBookEx(105,"Apsara",25.00,50);
		
		ArrayList<NoteBookEx> bookList =new ArrayList<NoteBookEx>();
		bookList.add(b1);
		bookList.add(b2);
		bookList.add(b3);
		bookList.add(b4);
		bookList.add(b5);
		
		System.out.println("-".repeat(50));
		System.out.println("Id"+"\t"+"Brand"+"\t"+"Price"+"\t"+"Pages");
		System.out.println("-".repeat(50));
		for(NoteBookEx obj:bookList)
		{
			System.out.println(obj.getId()+"\t"+obj.getBrand()+"\t"+obj.getPrice()+"\t"+obj.getPages());
		}
		System.out.println("-".repeat(50));
	}
}


