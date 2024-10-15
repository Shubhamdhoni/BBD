Feature: Open Amazon APP

  Scenario: To Validate search feature on amazon
    Given open Amazon
    When search for "iphone"
    And click on search button
    Then search result should display
