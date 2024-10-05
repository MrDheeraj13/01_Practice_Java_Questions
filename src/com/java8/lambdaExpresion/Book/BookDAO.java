package com.java8.lambdaExpresion.Book;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {
	
	public List<Book> getBook(){
		List<Book> book = new ArrayList<>();
		book.add(new Book(1001, "Java", 108));
		book.add(new Book(1002, "Java-8", 108));
		book.add(new Book(1003, "Spring Boot", 108));
		book.add(new Book(1004, "Microservices", 108));
		book.add(new Book(1005, "Kafka", 108));		
		book.add(new Book(1006, "Splucks", 108));		
		book.add(new Book(1007, "Docker", 108));		
		return book;
		
	}

}
