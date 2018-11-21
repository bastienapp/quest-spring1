package com.wildcodeschool.myLibrary.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fantasyBookId")
public class FantasyBook implements Book {

	@Autowired
	@Qualifier("adventurousDrinkAdvice")
	private DrinkAdviceInterface drinkAdvice;
	
	public FantasyBook(DrinkAdviceInterface theDrinkAdvice) {
		drinkAdvice = theDrinkAdvice;
	}
	
	@Override
	public String readExtract(){
		return "When Mr. Bilbo Baggins of Bag End announced that...";
	}

	@Override
	public String displayDrinkAdvice() {
		return this.drinkAdvice.sendDrinkAdvice();
	}
}
