package com.wildcodeschool.myLibrary.models;

import org.springframework.stereotype.Component;

@Component
public class AdventurousDrinkAdvice implements DrinkAdviceInterface {

	@Override
	public String sendDrinkAdvice() {
		return "With this book, drink a glass of Bloody Mary. Hurrah !";
	}
}
