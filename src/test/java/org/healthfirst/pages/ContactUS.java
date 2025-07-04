package org.healthfirst.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ContactUS {
	WebDriver dr;

	public ContactUS(WebDriver dr) {
		this.dr = dr;
		PageFactory.initElements(dr, this);
	}
}