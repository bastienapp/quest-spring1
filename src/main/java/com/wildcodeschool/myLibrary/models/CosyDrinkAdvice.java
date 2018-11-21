package com.wildcodeschool.myLibrary.models;

import org.springframework.stereotype.Component;

@Component
public class CosyDrinkAdvice implements DrinkAdviceInterface {

	@Override
	public String sendDrinkAdvice() {
		return "With this book, you should try a mug of nice hot chocolate !";
	}
}
