package org.healthfirst.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InfoForMembers {
	WebDriver dr;

	public InfoForMembers(WebDriver dr) {
		this.dr = dr;
		PageFactory.initElements(dr, this);
	}

	@FindBy(xpath = "//a[@class='dropdown-link'][normalize-space()='Login']")
	WebElement loginAction;

	public PortalLoginPage clickOnLoginAction() {
		loginAction.click();
		return new PortalLoginPage(dr);

	}

}
