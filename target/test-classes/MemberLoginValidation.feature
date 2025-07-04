
Feature: Member Login Verification
	@smoke @regression
	Scenario: Should be able to verify Member logged portal title
    Given I am on healthfirst homepage
    And I click on login dropdown button
    And I should redirect to member portal tab
    Then I verify the member portalpage title as "Member Portal | Healthfirst"
    And I close the browser

	@regression
  Scenario Outline: Should be able to verify the title once Member is logged in
    Given I should be logged in successfully with "<username>","<password>"
    Then I verify the portalpage title after loggedin as "Member Portal | Healthfirst"
    And I close the browser

    Examples: >
      | username | password  |
      | mahak247 | MmhK@2789 |