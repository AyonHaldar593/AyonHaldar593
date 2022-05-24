Feature: To test login of TestYou app

  Scenario: Check Login is successful with valid username and password
    Given user is in login page
    When user enter valid username and password
    And user clicks on the loging button
    Then user is navigated to login page
