@regression
Feature: MemberPortalPage Title verification

  Scenario Outline: Should be able to verify Member Portal Page Title
    Given I am on healthfirst homepage
    Then I verify the homepage title as "NY Health Insurance Information | Healthfirst"
    When I click on login dropdown button
    And I should redirect to member portal tab
    And I enter username as "<username>"
    And I enter password as "<password>"
    And I click on login button
    Then I verify the member portalpage title as "Member Portal | Healthfirst"
    And I close the browser

    Examples:
      | username | password  |
      | mahak247 | MmhK@2789 |