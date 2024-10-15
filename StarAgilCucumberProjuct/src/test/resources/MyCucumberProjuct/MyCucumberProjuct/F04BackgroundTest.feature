Feature: Testing Practice Page using Background

  Background: 
    Given open the browser & add url of application

  Scenario: Testing with correct (userName & password)
    When Enter a valid userName 
    When Enter a valid password 
    And Click on a login button
    Then Home page display

  Scenario: Testing with wrong (userName & password)
    When Enter in-valid userName 
    When Enter in-valid password 
    And Click in to login button
    Then Error msg display
