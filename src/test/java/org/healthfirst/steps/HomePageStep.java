package org.healthfirst.steps;

import org.healthfirst.base.Browser;
import org.healthfirst.pages.*;
import org.healthfirst.utils.Utility;
import org.openqa.selenium.*;
import io.cucumber.java.en.*;

public class HomePageStep {
	Homepage homePage;
	FormsAndDocuments formsAndDocuments;
	MemberLoginPortal memberPortal;
	PortalLoginPage portal;
	MemberOverview memberOverview;
	InfoForMembers infoForMembers;
	WebDriver dr;
	String browser = "chrome";

	@Given("I am on healthfirst homepage")
	public void i_am_on_healthfirst_homepage() {
		dr = Browser.openBrowser(browser);
		homePage = new Homepage(dr);
		memberPortal = new MemberLoginPortal(dr);
		portal = new PortalLoginPage(dr);
		memberOverview = new MemberOverview(dr);
		infoForMembers = new InfoForMembers(dr);
	}

	@Then("I verify the homepage title as {string}")
	public void i_verify_the_homepage_title_as(String expectedtitle) {
		Utility.verify(expectedtitle, dr.getTitle());
	}

	@And("I close the browser")
	public void i_close_the_browser() {
		dr.quit();
	}

//	**********************************************************************************************

	@When("I click on login dropdown button")
	public void i_click_on_login_dropdown_button() {
		homePage.clickOnMemberPortal();
	}

	@And("I should redirect to member portal tab")
	public void i_should_redirect_to_member_portal_tab() {
		memberPortal.switchScreen();
	}

	@And("I enter username as {string}")
	public void i_enter_username_as(String userName) {
		memberPortal.enterUsername(userName);
	}

	@And("I enter password as {string}")
	public void i_enter_password_as(String pasWword) {
		memberPortal.enterPassword(pasWword);
	}

	@And("I click on login button")
	public void i_click_on_login_button() {
		memberPortal.clickOnLoginButton();
	}

	@And("I click on login action")
	public void i_click_on_login_action() {
		infoForMembers.clickOnLoginAction();
	}

	@Then("I verify the member portalpage title as {string}")
	public void i_verify_the_member_portalpage_title_as(String expectedTitle) {
		Utility.verify(expectedTitle, dr.getTitle());
	}

//	*********************************************************************************************

	@Given("I should be logged in successfully with {string},{string}")
	public void i_should_be_logged_in_successfully_with(String username, String password) {
		i_am_on_healthfirst_homepage();
		homePage.clickOnMemberPortal();
		memberPortal.loginFuntion(username, password);
		portal.popsUpDecline();
	}

	@Then("I verify the portalpage title after loggedin as {string}")
	public void i_verify_the_portalpage_title_after_loggedin(String expectedTitle) {
		Utility.verify(expectedTitle, dr.getTitle());
	}

//	**********************************************************************************************

	@When("I hoverover mouse at infoForMembers")
	public void i_hoverover_mouse_at_infoForMembers() {
		homePage.hoveover();
	}

	@When("I click on Members Overview")
	public void i_click_on_Members_Overview() {
		homePage.clickOnMemberOverview();
	}

	@And("I scrol down the page")
	public void i_scrol_down_the_page() {
		memberOverview.scrollToElement(dr, "//h3[normalize-space()='General Resources']");
	}

//	**********************************************************************************************

	@Then("I should get the element {string} and verify") // ok
	public void i_should_get_the_element_and_verify(String expcted) {
		String actual = dr.findElement(By.xpath("//h3[normalize-space()='General Resources']")).getText();
		Utility.verify(actual, expcted);
	}

	@When("I click on PayMyBill button") // ok
	public void i_click_on_PayMyBill_button() throws InterruptedException {
		memberOverview.clickOnPayMyBill();
	}

	@Then("I should verify the page title as {string}") // ok
	public void i_should_verify_the_page_title_as(String expctedTitle) {
		Utility.verify(dr.getTitle(), expctedTitle);
	}

	@And("I click on Documents button") // ok
	public void i_click_on_Documents_button() throws InterruptedException {
		memberOverview.clickOnDocuments();
	}

	@And("I click on Contact US button")
	public void i_click_on_Contact_US_button() throws InterruptedException {
		memberOverview.clickOnContuckUsButton();
	}

	@And("I click on Search FAQs button")
	public void i_click_on_Search_FAQs_button() throws InterruptedException {
		memberOverview.clickOnSearchFAQs();
	}

	@And("I click on LearnMore Healthy Resources")
	public void i_click_on_LearnMore_Healthy_Resources() throws InterruptedException {
		memberOverview.clickOnHealthyResource();
	}

	@And("I click on LearnMore COVID19 Community Resources")
	public void i_click_on_LearnMore_COVID19_Community_Resources() throws InterruptedException {
		memberOverview.clickOnCOVID19CommunityResources();
	}

//	----------------------------------------------------------------------------------------------

	@When("I hoverover mouse at Plans")
	public void i_hoverover_mouse_at_Plans() {
		formsAndDocuments.hoveoverOnPlans();

	}

	@When("I click on Forms and Documents")
	public void i_click_on_Forms_and_Documents() {
		formsAndDocuments.clickOnFormsAndDocuments();
	}

}