@AllLinks
Feature: Test Google Links

  Background: 
    Given Open an a google application

  @GmailTest
  Scenario: Test Gmail link
    When Click on a gmail link
    Then Gmail page should display

  @ImageTest
  Scenario: Test Images link
    When Click on a Images link
    Then Images page should display

  @AdvtTest  
  Scenario: Test Advt link
    When Click on a Advt link
    Then Advt page should display

  @Business
  Scenario: Test Business link
    When Click on a Business link
    Then Business page should display
