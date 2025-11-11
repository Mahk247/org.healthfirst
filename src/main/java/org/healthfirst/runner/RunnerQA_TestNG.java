package org.healthfirst.runner;

import org.healthfirst.utils.EmailSender;
import org.testng.annotations.*;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	    features = "src/test/resources/features",
	    glue = "org.healthfirst.steps",
	    tags = "@regression",
	    plugin = {"pretty", "html:target/cucumber-TestNG.html"}
	)


public class RunnerQA_TestNG extends AbstractTestNGCucumberTests {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("======before suite====");
	}

	@AfterSuite
	public void bafterSuite() {
		EmailSender.emailSender();
	}
}