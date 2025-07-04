package org.healthfirst.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HealthfirstMobileApp {
	WebDriver dr;

	public HealthfirstMobileApp(WebDriver dr) {
		this.dr = dr;
		PageFactory.initElements(dr, this);
	}

}