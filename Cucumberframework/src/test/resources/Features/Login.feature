Feature: Test the Login Fnctionality of SauceDemo with datatable also
# Scenario: Test the Login Validation
# Given the user is already in login page
# When user enters "admin" and "admin123"
# And clicks on login button
# Then user should land on home page
@smoke
  Scenario Outline: Test the Login Validation for tags with smoke
    Given the user is already in login page
    When user enters <username> and <password>
    And clicks on login button
    And user should land on home page
    Then user is on home page
    Then user adds items

    Examples:
      | username                | password     |
      | standard_user           | secret_sauce |


@regression
  Scenario Outline: Test the Login Validation for tags with regression
    Given the user is already in login page
    When user enters <username> and <password>
    And clicks on login button
    And user should land on home page
    Then user is on home page
    Then user adds items

    Examples:
      | username                | password     |
      | locked_out_user         | secret_sauce |

