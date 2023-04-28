Feature: feature is to Test the login functionality

   @functinal @smoke
   
  Scenario: check login with valid User ID and Password
    Given user should be on login page
    When user given correct userID
    And user given correct Password
    And user click on login button
    Then user should be redirect to home page

   @smoke

  Scenario: check login with valid User ID and password
    Given user should be on login page
    When User get the title of page
    Then page title should be verified
