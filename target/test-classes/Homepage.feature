Feature: Homepage Title Verification
	@smoke
  Scenario: Should be able to verify Homepage Title
    Given I am on healthfirst homepage
    Then I verify the homepage title as "NY Health Insurance Information | Healthfirst"
    And I close the browser
