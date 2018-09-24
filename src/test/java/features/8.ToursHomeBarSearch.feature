Feature: Tours HomePage Search
  Scenario: Tours HomePage Search
    Given User is on PHP Travels HomePage with Tours bar
    When User picks Tours bar filters for each section
    Then User clicks Tours bar Search button
    And Tours with picked criteria is visible on the Tours module Page