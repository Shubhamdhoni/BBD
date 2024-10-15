Feature: Test practice login page

  Scenario Outline: Verify the login functionality
    Given open application "https://practice.expandtesting.com/login"
    When Enter the un as "<UserName>"
    When Enter the password as "<Password>"
    And Click on a login button
    Then home page should be display

    Examples: 
      | UserName | Password             |
      | practice | SuperSecretPassword! |
      | shubham  | dhoni                |
      | practice | SuperSecretPassword! |
