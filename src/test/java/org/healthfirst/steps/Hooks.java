//package org.healthfirst.steps;
//
//import org.apache.log4j.Logger;
//import org.healthfirst.base.Browser;
//import org.healthfirst.utils.Utility;
//import org.openqa.selenium.WebDriver;
//import org.testng.annotations.*;
//
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//
//public class Hooks {
//	private static Logger log = Utility.getLog(Browser.class);
//	WebDriver dr;
//	
//	@BeforeMethod
//	public void runBeforeScenario() {
//		log.info("==========BeforeMethod============");
//		
//	}
//
//	@AfterMethod
//	public void i_close_the_browser()  {
//		log.info("==========AfterMethod============");
//		dr.quit();
//
//	}
//
//	@Before("@smoke")
//	public void runBeforeTagScenario() {
//		log.info("==========+Before @smoke Tag============");
//	}
//
//	@After("@smoke")
//	public void runAfterTagScenario() {
//		log.info("==========After @smoke Tag============");
//	}
//}
