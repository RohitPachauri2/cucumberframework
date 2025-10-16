Feature: Tags in Cucumber

  @smoketest @regressiontest
  Scenario: Test the Login Validation using DataTable 1
    Given the user is already in login page
    When user enters credentials with datatable
      | Admin  | admin123 |
    And clicks on login button
    Then user should land on home page

  @smoketest
  Scenario: Test the Login Validation using DataTable 2
    Given the user is already in login page
    When user enters credentials with datatable
      | Admin  | admin123 |
    And clicks on login button
    Then user should land on home page

  @regressiontest
  Scenario: Test the Login Validation using DataTable 3
    Given the user is already in login page
    When user enters credentials with datatable
      | Admin  | admin123 |
    And clicks on login button
    Then user should land on home page
