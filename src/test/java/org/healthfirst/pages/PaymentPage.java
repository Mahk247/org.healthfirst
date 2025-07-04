package org.healthfirst.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {
	WebDriver dr;

	public PaymentPage(WebDriver dr) {
		this.dr = dr;
		PageFactory.initElements(dr, this);
	}
}