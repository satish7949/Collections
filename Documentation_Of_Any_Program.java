package com.jspiders.learningArrays;

/**
 * This class is developed to represent the library of books
 */
class BookLibrary{
	private Book[] books;
	public BookLibrary() {
		books=new Book[10];
	}
	public BookLibrary(int n){
		books=new Book[n];
	}
	
	/**
	 * this method  store the given book b in the library 
	 */
	public void addBook(Book b) {
		// code to store
	}
	
	/**
	 * return the totale no of book in the library 
	 */
	public int totalBook() {
		return 0;
	}
	/**
	 * search and return the book based on author name ,if books not found return null
	 */
	public Book searchBookByAuthor(String author) {
		
		return null;
	}
	
	/**
	 * search and return the book based on title ,if book not found return null
	 */
	public Book searchByTitle(String title) {
		return null;
	}
	
	/**
	 * search and return the book on id,if book not found return null;
	 */
	public Book searchById(int id) {
		return null;
	}
}
public class Documentation_Of_Any_Program {
	public static void main(String[] args) {
		
	}
}
