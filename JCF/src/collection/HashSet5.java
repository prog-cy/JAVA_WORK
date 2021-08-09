package collection;

import java.util.*;

class Book{
	
	String bookName, publisher, author;
	
	Book(String bookName, String publisher, String author){
		
		this.author = author;
		this.bookName = bookName;
		this.publisher = publisher;
	}
	
	public String toString() {
		
		return author+" "+bookName+" "+publisher;
	}
}

public class HashSet5 {

	public static void main(String[] args) {

		Book[] a = new Book[3];
		a[0] = new Book("Let us C","Yashwant Kanetkar","BPB");
		a[1] = new Book("Data Communications & Networking","Forouzan","Mc Graw Hill");
		a[2] = new Book("Operating System","Galvin","Wiley");
		
		HashSet<Book> set = new HashSet<Book>();
		
		set.add(a[0]);
		set.add(a[1]);
		set.add(a[2]);
		
		Iterator<Book> it = set.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
		
		for(Book b : set)
			System.out.println(b.author+" "+b.bookName+" "+b.publisher);
			

	}

}
