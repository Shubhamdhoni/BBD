Feature: Test Google Search

  Scenario: To Validate Google search Functionality
    Given I Open Google
    When I enter text in searchbox
    And I hit enter
    Then Valid search should display
