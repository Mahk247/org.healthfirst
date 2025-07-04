package org.healthfirst.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class COVID19CommunityResources {
	WebDriver dr;

	public COVID19CommunityResources(WebDriver dr) {
		this.dr = dr;
		PageFactory.initElements(dr, this);
	}
}