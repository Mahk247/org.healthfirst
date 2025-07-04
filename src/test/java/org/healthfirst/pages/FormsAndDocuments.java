package org.healthfirst.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormsAndDocuments {
	Actions actions;
	WebDriver dr;

	public FormsAndDocuments(WebDriver dr) {
		this.dr = dr;
		PageFactory.initElements(dr, this);
	}

	@FindBy(xpath = "//ul[@class='dropdown-menu show']//a[@class='dropdown-link'][normalize-space()='Forms & Documents']")
	WebElement formsAndDocuments;

	public void hoveoverOnPlans() {
		actions = new Actions(dr);
		WebElement plans = dr.findElement(By.xpath("//a[@id='plansDropdown']"));
		actions.moveToElement(plans).perform();
	}

	public void clickOnFormsAndDocuments() {
		formsAndDocuments.click();
	}

}