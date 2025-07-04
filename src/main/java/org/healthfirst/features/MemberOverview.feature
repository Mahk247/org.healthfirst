@smoke
Feature: Should be test Member Overview menu functions

  Background: 
    Given I am on healthfirst homepage
    When I hoverover mouse at infoForMembers
    And I click on Members Overview
    And I scrol down the page

  Scenario: Should be verify General Resources
    Then I should get the element "General Resources" and verify
    And I close the browser

  Scenario: Should be verify Pay My Bill button workig
    And I click on PayMyBill button
    Then I should verify the page title as "Bill Pay Login | Healthfirst"
    And I close the browser

  Scenario: Should be verify Documents button working
    And I click on Documents button
    Then I should verify the page title as "Health Plan Forms and Documents | Healthfirst"
    And I close the browser

  Scenario: Should be verify Contact US button
    And I click on Contact US button
    Then I should verify the page title as "Contact Us | Healthfirst"
    And I close the browser

  Scenario: Should be verify Search FAQs button
    And I click on Search FAQs button
    Then I should verify the page title as "New York Health Insurance FAQs | Healthfirst"
    And I close the browser

  Scenario: Should be verify Healthy Resources
    And I click on LearnMore Healthy Resources
    Then I should verify the page title as "Provider Healthy Resources | Healthfirst"
    And I close the browser

  Scenario: Should be verify COVID19 Community Resources
    And I click on LearnMore COVID19 Community Resources
    Then I should verify the page title as "COVID-19 Resources | Healthfirst"
    And I close the browser
