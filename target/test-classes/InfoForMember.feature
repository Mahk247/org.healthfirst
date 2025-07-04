Feature: All the funtionality in Info for Members will be verified

 Scenario: I should go to login page through Actions menu
    Given I am on healthfirst homepage
    When I hoverover mouse at infoForMembers
    And I click on login action
    And I should redirect to member portal tab
    When I enter username as "mahak247"
    And I enter password as "MmhK@2789"
    And I click on login button
    Then I verify the member portalpage title as "Member Portal | Healthfirst"
    And I close the browser
