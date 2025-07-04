$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/java/org/healthfirst/features/MemberLoginPortal.feature");
formatter.feature({
  "name": "MemberPortalPage Title verification",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Should be able to verify Member Portal Page Title",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am on healthfirst homepage",
  "keyword": "Given "
});
formatter.step({
  "name": "I verify the homepage title as \"NY Health Insurance Information | Healthfirst\"",
  "keyword": "Then "
});
formatter.step({
  "name": "I click on login dropdown button",
  "keyword": "When "
});
formatter.step({
  "name": "I should redirect to member portal tab",
  "keyword": "And "
});
formatter.step({
  "name": "I enter username as \"\u003cusername\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "I enter password as \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "name": "I verify the member portalpage title as \"Member Portal | Healthfirst\"",
  "keyword": "Then "
});
formatter.step({
  "name": "I close the browser",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "mahak247",
        "MmhK@2789"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Should be able to verify Member Portal Page Title",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "I am on healthfirst homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "org.healthfirst.steps.HomePageStep.i_am_on_healthfirst_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify the homepage title as \"NY Health Insurance Information | Healthfirst\"",
  "keyword": "Then "
});
formatter.match({
  "location": "org.healthfirst.steps.HomePageStep.i_verify_the_homepage_title_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on login dropdown button",
  "keyword": "When "
});
formatter.match({
  "location": "org.healthfirst.steps.HomePageStep.i_click_on_login_dropdown_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should redirect to member portal tab",
  "keyword": "And "
});
formatter.match({
  "location": "org.healthfirst.steps.HomePageStep.i_should_redirect_to_member_portal_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter username as \"mahak247\"",
  "keyword": "And "
});
formatter.match({
  "location": "org.healthfirst.steps.HomePageStep.i_enter_username_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter password as \"MmhK@2789\"",
  "keyword": "And "
});
formatter.match({
  "location": "org.healthfirst.steps.HomePageStep.i_enter_password_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "org.healthfirst.steps.HomePageStep.i_click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify the member portalpage title as \"Member Portal | Healthfirst\"",
  "keyword": "Then "
});
formatter.match({
  "location": "org.healthfirst.steps.HomePageStep.i_verify_the_member_portalpage_title_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "org.healthfirst.steps.HomePageStep.i_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/main/java/org/healthfirst/features/MemberLoginValidation.feature");
formatter.feature({
  "name": "Member Login Verification",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Should be able to verify Member logged portal title",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "I am on healthfirst homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "org.healthfirst.steps.HomePageStep.i_am_on_healthfirst_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on login dropdown button",
  "keyword": "And "
});
formatter.match({
  "location": "org.healthfirst.steps.HomePageStep.i_click_on_login_dropdown_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should redirect to member portal tab",
  "keyword": "And "
});
formatter.match({
  "location": "org.healthfirst.steps.HomePageStep.i_should_redirect_to_member_portal_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify the member portalpage title as \"Member Portal | Healthfirst\"",
  "keyword": "Then "
});
formatter.match({
  "location": "org.healthfirst.steps.HomePageStep.i_verify_the_member_portalpage_title_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "org.healthfirst.steps.HomePageStep.i_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Should be able to verify the title once Member is logged in",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "I should be logged in successfully with \"\u003cusername\u003e\",\"\u003cpassword\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "I verify the portalpage title after loggedin as \"Member Portal | Healthfirst\"",
  "keyword": "Then "
});
formatter.step({
  "name": "I close the browser",
  "keyword": "And "
});
formatter.examples({
  "name": "\u003e",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "mahak247",
        "MmhK@2789"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Should be able to verify the title once Member is logged in",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "I should be logged in successfully with \"mahak247\",\"MmhK@2789\"",
  "keyword": "Given "
});
formatter.match({
  "location": "org.healthfirst.steps.HomePageStep.i_should_be_logged_in_successfully_with(java.lang.String,java.lang.String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@id\u003d\"ReactAppWrapper-wide\"]/div[4]/div/div[4]/div/div/div[3]/div\"}\n  (Session info: chrome\u003d138.0.7204.97)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027MHK\u0027, ip: \u0027192.168.12.101\u0027, os.name: \u0027Windows 11\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002717.0.7\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 138.0.7204.97, chrome: {chromedriverVersion: 138.0.7204.92 (f079b9bc781e..., userDataDir: C:\\Users\\mahmu\\AppData\\Loca...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:65302}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: a058410f784549200cbb7d54fe2a3bd9\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003d\"ReactAppWrapper-wide\"]/div[4]/div/div[4]/div/div/div[3]/div}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat jdk.proxy2/jdk.proxy2.$Proxy25.click(Unknown Source)\r\n\tat org.healthfirst.pages.PortalLoginPage.popsUpDecline(PortalLoginPage.java:30)\r\n\tat org.healthfirst.steps.HomePageStep.i_should_be_logged_in_successfully_with(HomePageStep.java:83)\r\n\tat ✽.I should be logged in successfully with \"mahak247\",\"MmhK@2789\"(file:///C:/Users/mahmu/OneDrive/Desktop/OSA0521202324A/eclipse-workspace/org.healthfirst/src/main/java/org/healthfirst/features/MemberLoginValidation.feature:13)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "I verify the portalpage title after loggedin as \"Member Portal | Healthfirst\"",
  "keyword": "Then "
});
formatter.match({
  "location": "org.healthfirst.steps.HomePageStep.i_verify_the_portalpage_title_after_loggedin(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "org.healthfirst.steps.HomePageStep.i_close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});