Feature: Login functionailty

  Scenario: Login with correct credentials
    Given  i am on the login page
    And  i entered the correct credentials
    And i click login button
    Then i should be on the homepage
