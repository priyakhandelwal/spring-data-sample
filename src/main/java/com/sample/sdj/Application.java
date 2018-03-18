package com.sample.sdj;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		BookRepository bookRepository = context.getBean(BookRepository.class);
		
//		Optional<Book> result = bookRepository.findById(1L);
//		if(result.isPresent()) {
//			Book book = result.get();
//			System.out.println(book.toString());
//		} else {
//			System.out.println("No book found");	
//		}
		
//		List<Book> books = bookRepository.findAll();
//		for(Book book: books) {
//			System.out.println(book.toString());
//		}
		
		List<Book> books = bookRepository.findAllById(new ArrayList<Long>() {{add(1L); add(4L);}});
		
		for(Book book : books) {
			System.out.println(book.toString());
		}
		context.close();
	}
	
	
}
