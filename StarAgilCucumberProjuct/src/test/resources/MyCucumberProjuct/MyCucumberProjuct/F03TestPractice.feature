Feature: Test Practice Test Login

  Scenario: To validate login with valid data
    Given Open Practice test
    When Enter valid userName
    When Enter valid password
    And Click on login button
    Then Home page should display

  Scenario: To validate login with In-valid data
    Given Open Practice test
    When Enter In-valid userName
    When Enter In-valid password
    And Click on submit button
    Then error message should display
