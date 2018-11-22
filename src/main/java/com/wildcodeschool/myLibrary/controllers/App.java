package com.wildcodeschool.myLibrary.controllers;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wildcodeschool.myLibrary.models.Book;

public class App {
	
	public void start() {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
		
		Book myBook = context.getBean("fantasyBookId", Book.class);
		
		context.close();
		
		System.out.println("");
		System.out.println("******************");
		System.out.println(myBook.readExtract());
		System.out.println("******************");
		System.out.println(myBook.displayDrinkAdvice());
	}
}
