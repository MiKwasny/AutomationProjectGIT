Feature: Hotels HomePage Search
  Scenario: Hotels HomePage Search
    Given User is on PHP Travels HomePage with Hotel bar
    When User picks Hotel bar filters for each section
    Then User clicks Hotel bar Search button
    And Hotels with picked criteria is visible on the Hotel module Page