package com.sample.sdj;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext context 
		= new AnnotationConfigApplicationContext(DataConfiguration.class)) {
			
			BookService service = context.getBean(BookService.class);
			
			Book book = new Book();
			book.setTitle("The Dark Forest");
			book.setPrice(new BigDecimal("500.00"));
			book.setPublishDate(new Date());
			
			service.save(book);
			System.out.println("**SAVED****");
		}
	}
}
