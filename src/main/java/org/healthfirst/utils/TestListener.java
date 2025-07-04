package org.healthfirst.utils;

import org.apache.log4j.Logger;
import org.healthfirst.base.Browser;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {
	private static Logger log = Utility.getLog(Browser.class);

	public void onTestStart(ITestResult result) {
		log.info("New test started " + result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		log.info("Test Successfully Finished " + result.getName());
	}

	public void onTestFailure(ITestResult result) {
		log.info("Test Failed " + result.getName());
		WebDriver dr = Browser.hm.get("driver");
		Utility.takeScreensShot(dr, result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		log.info("Test Skipped " + result.getName());
	}

}