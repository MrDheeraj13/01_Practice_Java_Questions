package com.java8.lambdaExpresion.Book;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {
//	(o1,o2)-> o2.getName().compareTo(o1.getName());
//	
//	

	public List<Book> getBooksinSort(){
		List<Book> books = new BookDAO().getBook();
		Collections.sort(books , (o1,o2)-> o2.getName().compareTo(o1.getName()));

//			@Override
//			public int compare(Book o1, Book o2) {
//				return o2.getName().compareTo(o1.getName());
//			}
//			
		
		return books;
	}
	
	public static void main(String[] args) {
		System.out.println(new BookService().getBooksinSort());
	}
}


//class MyComparatore implements Comparator<Book>{
//
//	@Override
//	public int compare(Book o1, Book o2) {
//		
//		return o1.getName().compareTo(o2.getName());
//	}
//	
//}