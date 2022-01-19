Feature: Title of your feature
  I want to use this template for my feature file

  Background: 
    Given User already login and in home page
      | username             | password   |
      | Kaaviyas12@gmail.com | Vishnu@123 |

  Scenario: To verify the home page
    Given User in home page
    When get the given menu list
      | Kaaviya S    |
      | Find Friends |
      | Groups       |
      | Welcome      |
      | Marketplace  |
    Then list should be displayed correctly
