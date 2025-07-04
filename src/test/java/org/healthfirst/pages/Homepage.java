package org.healthfirst.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;

public class Homepage {
	Actions actions;
	WebDriver dr;

	public Homepage(WebDriver dr) {
		this.dr = dr;
		PageFactory.initElements(dr, this);
	}

	@FindBy(xpath = "//ul[@class='nav nav-header d-md-none d-lg-flex']//a[@id='loginDropdown']")
	WebElement loginDropdown;
	@FindBy(xpath = "//ul[@class='dropdown-menu show']//a[@class='dropdown-link'][normalize-space()='Member Portal']")
	WebElement portal_subButton;
	@FindBy(xpath = "//a[@id='infoForMembersDropdown']")
	WebElement infoForMembers;
	@FindBy(xpath = "//a[@class='dropdown-link nav-active']")
	WebElement memberOverview;
	@FindBy(xpath = "//*[@id=\"mainNav\"]/div[2]/ul/li[3]/div/div/div[1]/ul/li[3]/a")
	WebElement HealthfirstNY_MobileApp;
	@FindBy(xpath = "//*[@id=\"mainNav\"]/div[2]/ul/li[3]/div/div/div[1]/ul/li[4]/a")
	WebElement Pharmacy;
	@FindBy(xpath = "//*[@id=\"mainNav\"]/div[2]/ul/li[3]/div/div/div[1]/ul/li[5]/a")
	WebElement Covid19Resources;
	@FindBy(xpath = "//*[@id=\"mainNav\"]/div[2]/ul/li[3]/div/div/div[1]/ul/li[6]/a")
	WebElement FormsAndDocuments;

	public MemberLoginPortal clickOnMemberPortal() {
		loginDropdown.click();
		portal_subButton.click();
		return new MemberLoginPortal(dr);
	}

	public void hoveover() {
		actions = new Actions(dr);
		WebElement InfoForMembers = dr.findElement(By.xpath("//a[@id='infoForMembersDropdown']"));
		actions.moveToElement(InfoForMembers).perform();
	}

	public MemberOverview clickOnMemberOverview() {
		dr.findElement(By.xpath("//a[normalize-space()='Members Overview']")).click();
		return new MemberOverview(dr);
	}

	public HealthfirstMobileApp clickOnHealthfirstNY_MobileApp() {
		HealthfirstNY_MobileApp.click();
		return new HealthfirstMobileApp(dr);
	}

}