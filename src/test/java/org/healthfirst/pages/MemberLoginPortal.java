package org.healthfirst.pages;

import java.util.Set;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class MemberLoginPortal {
	WebDriver dr;

	public MemberLoginPortal(WebDriver dr) {
		this.dr = dr;
		PageFactory.initElements(dr, this);
	}

	@FindBy(xpath = "//input[@id='username']")
	WebElement usernameBox;
	@FindBy(xpath = "//input[@id='password']")
	WebElement passwordBox;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement loginButton;

	public WebDriver switchScreen() {
		String sc1 = dr.getWindowHandle();
		Set<String> sc2 = dr.getWindowHandles();
		for (String sc : sc2) {
			if (!sc.equals(sc1)) {
				dr.switchTo().window(sc);
			}
		}
		return dr;
	}

	public void enterUsername(String username) {
		usernameBox.sendKeys(username);
	}

	public void enterPassword(String password) {
		passwordBox.sendKeys(password);
	}

	public PortalLoginPage clickOnLoginButton() {
		loginButton.click();
		return new PortalLoginPage(dr);
	}

	public void loginFuntion(String username, String password) {
		switchScreen();
		usernameBox.sendKeys(username);
		passwordBox.sendKeys(password);
		loginButton.click();
	}

}