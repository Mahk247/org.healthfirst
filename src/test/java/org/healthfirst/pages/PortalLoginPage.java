package org.healthfirst.pages;

import org.healthfirst.utils.Utility;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class PortalLoginPage {
	WebDriver dr;

	public PortalLoginPage(WebDriver dr) {
		this.dr = dr;
		PageFactory.initElements(dr, this);
	}

	@FindBy(xpath = "//button[@class='Button-sc-117al17-7 cPxPBF']")
	WebElement popsupDecline;
	@FindBy(xpath = "//*[@id=\"ReactAppWrapper-wide\"]/div[4]/div/div[4]/div/div/div[3]/div")
	WebElement clickonMaybeLater;
	@FindBy(xpath = "//span[normalize-space()='Member ID Card']")
	WebElement IdCardButton;
	@FindBy(xpath = "//p[@class='StyledTypography-sc-10m15f-0 kKekSk Description-sc-1votfwh-2 hTXWoN']")
	WebElement textVerification;
	@FindBy(xpath = "//*[@id=\"tba-main-container\"]/div/div[2]/div/div[1]/p/text()")
	WebElement claimsButton;
	@FindBy(xpath = "//*[@id=\"ReactAppWrapper-wide\"]/div[5]/div[1]/button")
	WebElement SubmitClaimsButton;

	public void popsUpDecline() {
		popsupDecline.click();
		clickonMaybeLater.click();
	}

	public void clickOnIdCardButton() {
		IdCardButton.click();

	}

	public void textVerification() {
		String actualText = textVerification.getText();
		String expectedText = "This section contains all necessary information for your membership that may not exist on your physical ID card.";
		Utility.verify(actualText, expectedText);
	}

	public void claims() {
		claimsButton.click();
		SubmitClaimsButton.isDisplayed();
	}
}