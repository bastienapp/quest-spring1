package com.wildcodeschool.myLibrary.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("scienceFictionId")
public class ScienceFictionBook implements Book {

	@Autowired
	@Qualifier("adventurousDrinkAdvice")
	private DrinkAdviceInterface drinkAdvice;
	
	public ScienceFictionBook(DrinkAdviceInterface theDrinkAdvice) {
		drinkAdvice = theDrinkAdvice;
	}
	
	@Override
	public String readExtract(){
		return "His name was Gaal Dornick...";
	}

	@Override
	public String displayDrinkAdvice() {
		return this.drinkAdvice.sendDrinkAdvice();
	}
}
