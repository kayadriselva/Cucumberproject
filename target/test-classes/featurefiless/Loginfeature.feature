
Feature: To check the loginpage functionality
 

  Scenario: To check the login function
    Given user is on login page
    When user enter username and password "Kaaviya12@gmail.com" and "Vishnu@123"
    And click on login button
    Then verify the home page title should be "Facebook"
   
   Scenario: To check the forget password link
    Given user is on login page
    When user clicks on forget password link
    Then user navigates to forget passwork page and page title contains "Forgotten Password"