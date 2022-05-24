Feature: Check edit tab in TestYou app

  Scenario Outline: 
    Given user is in Login Page with valid <url>
    When user provides valid <userName> and <password>
    And user clicks on login button
    Then TestYou home page should be displayed
    When user clicks on edit button and provide <city> , <state> and <phonenumber>
    And user clicks on updated button
    Then system should update the details

  Examples: 
    |url|userName|password|city|state|phonenumber|
    |http://www.testyou.in/Login.aspx|adminayon|Test123|kolkata|WB|9821236521|

