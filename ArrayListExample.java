import java.util.*;

class Book {
	int id, quantity;
	String name, author, publisher;
	
	public Book(int id, String name, String author, String publisher, int quantity){
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
}

public class ArrayListExample {
	public static void main(String args[]){
		List<Book> list = new ArrayList<Book>();
		
		Book b1 = new Book(1, "abc", "xyz", "aaa", 1);
		Book b2 = new Book(2, "aaa", "aaa", "aaa", 5);
		Book b3 = new Book(3, "bbb", "bb", "bbb", 150);
		
		list.add(b1);
		list.add(b2);
		list.add(b3);
		
		for (Book b:list){
				System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		}
	}
}
