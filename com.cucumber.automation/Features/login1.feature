Feature: Verify the login for TestYou application
 
 
  Scenario Outline: 
    Given when users provide the valid <URL> , user should be on login page
    When users provide valid <userName> and <password>
    And users click on the login
    Then users should navigate to homePage

    Examples: 
      | URL                              | userName  | password |
      | http://www.testyou.in/Login.aspx | adminayon | Test123  |

 