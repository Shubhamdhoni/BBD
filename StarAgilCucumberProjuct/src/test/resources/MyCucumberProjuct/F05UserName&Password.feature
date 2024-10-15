Feature: Pass UserName & Password

  Scenario: passing username and password
    Given Open Practice test application
    When Enter userName as "student"
    When Enter password "Password123"
    And Click login button
    Then Home page should  be display
