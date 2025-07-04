package org.healthfirst.runner;

import org.testng.annotations.*;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//Additional tag: "@smoke"
@CucumberOptions(features = { "src\\main\\java\\org\\healthfirst\\features" }, glue = "org.healthfirst.steps", tags = {
		"@regression" }, plugin = { "json:target/cucumber-reports/Cucumber.json", "pretty",
				"de.monochromata.cucumber.report.PrettyReports:target/cucumber", "html:target/pretty-cucumber" })

public class RegrassionQA extends AbstractTestNGCucumberTests {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("======before suite====");
	}

	@AfterSuite
	public void afterSuite() {
		// EmailSender.emailSender();
		System.out.println("Email sent successfully with attachment.");
	}
}