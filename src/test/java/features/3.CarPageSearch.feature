Feature: Car Page Search
  Scenario: Car Page Search
    Given User is on PHP Travels Car module page
    When User picks car filters for each section
    Then User clicks Car Search button
    And Car with picked criteria is visible on the Page