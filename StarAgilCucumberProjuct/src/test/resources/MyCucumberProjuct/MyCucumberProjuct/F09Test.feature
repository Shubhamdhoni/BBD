Feature: Test practice application

  Scenario Outline: Verify the login functionality
    Given open app "https://practice.expandtesting.com/login"
    When Enter un as "<UserName>"
    When Enter ps as "<Password>"
    And Click on the login bt
    Then home page should be display

    Examples: 
      | UserName | Password             |
      | practice | SuperSecretPassword! |
      | shubham  | dhoni                |
      | practice | SuperSecretPassword! |