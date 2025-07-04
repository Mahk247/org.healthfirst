package org.healthfirst.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HealthyResources {
	WebDriver dr;

	public HealthyResources(WebDriver dr) {
		this.dr = dr;
		PageFactory.initElements(dr, this);
	}

}