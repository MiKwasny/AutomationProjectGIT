Feature: Hotel Page Search
  Scenario: Hotel Page Search
    Given User is on PHP Travels Hotel module page
    When User picks hotel filters for each section
    Then User clicks Hotel Search button
    And Hotel with picked criteria is visible on the Page