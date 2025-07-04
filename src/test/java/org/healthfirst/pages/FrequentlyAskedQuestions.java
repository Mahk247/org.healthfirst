package org.healthfirst.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class FrequentlyAskedQuestions {
	WebDriver dr;

	public FrequentlyAskedQuestions(WebDriver dr) {
		this.dr = dr;
		PageFactory.initElements(dr, this);
	}
}