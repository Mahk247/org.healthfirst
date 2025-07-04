package org.healthfirst.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class MemberOverview {
	WebDriver dr;

	public MemberOverview(WebDriver dr) {
		this.dr = dr;
		PageFactory.initElements(dr, this);
	}

	@FindBy(xpath = "//a[@title='Pay My Bill']")
	WebElement payMyBill;

	@FindBy(xpath = "//a[@title='Documents']")
	WebElement documentsButton;

	@FindBy(xpath = "//a[@title='Contact Us']")
	WebElement ContactUsButton;

	@FindBy(xpath = "//a[@title='Search FAQs']")
	WebElement FAQsButton;

	@FindBy(xpath = "//a[@href='https://healthfirst.org/healthy-resources'][normalize-space()='Learn More']")
	WebElement learnMoreHealthyResource;

	@FindBy(xpath = "//*[@id=\'general\']/div/div[3]/div[6]/div/div[2]/a")
	WebElement COVID19CommunityResources;

	public void scrollToElement(WebDriver dr, String element) {
		JavascriptExecutor js = (JavascriptExecutor) dr;
		js.executeScript("arguments[0].scrollIntoView(true);", dr.findElement(By.xpath(element)));

	}

	public PaymentPage clickOnPayMyBill() throws InterruptedException {
		Thread.sleep(2000);
		payMyBill.click();
		return new PaymentPage(dr);
	}

	public FormsAndDocuments clickOnDocuments() throws InterruptedException {
		Thread.sleep(2000);
		documentsButton.click();
		return new FormsAndDocuments(dr);
	}

	public ContactUS clickOnContuckUsButton() throws InterruptedException {
		Thread.sleep(2000);
		ContactUsButton.click();
		return new ContactUS(dr);
	}

	public FrequentlyAskedQuestions clickOnSearchFAQs() throws InterruptedException {
		Thread.sleep(2000);
		FAQsButton.click();
		return new FrequentlyAskedQuestions(dr);
	}

	public HealthyResources clickOnHealthyResource() throws InterruptedException {
		Thread.sleep(2000);
		learnMoreHealthyResource.click();
		return new HealthyResources(dr);
	}

	public COVID19CommunityResources clickOnCOVID19CommunityResources() throws InterruptedException {
		Thread.sleep(2000);
		COVID19CommunityResources.click();
		return new COVID19CommunityResources(dr);
	}

}