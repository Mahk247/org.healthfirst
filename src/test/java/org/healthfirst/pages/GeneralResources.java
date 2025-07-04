package org.healthfirst.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class GeneralResources {
	WebDriver dr;

	public GeneralResources(WebDriver dr) {
		this.dr = dr;
		PageFactory.initElements(dr, this);
	}

}
