Feature: Tours Page Search
  Scenario: Tours Page Search
    Given User is on PHP Travels Tours module page
    When User picks Tours filters for each section
    Then User clicks Tours Search button
    And Tours with picked criteria is visible on the Page